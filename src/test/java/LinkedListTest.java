
import org.junit.Test;
import com.olbati.listeChainee.*;
import static org.assertj.core.api.Assertions.assertThat;

public class LinkedListTest {

     LinkedList linkedList = new LinkedList();
     LinkedList linkedList_2 = new LinkedList();

     /*
      * Vérifier le nombre des elements dans une liste chainnee
     */
    @Test
    public void should_compute_size(){
        Node node = new Node(3);
        linkedList.head.next = node;
        assertThat(linkedList.size()).isEqualTo(1);
    }

    /*
     * Vérifier la concatenation dans une liste chainee
     */
    @Test
    public void should_append_a_linkedlist_to_my_linkedlist() {

        // Given
        Node node_1 = new Node(15);
        Node node_2 = new Node(18);
        Node node_3 = new Node(20);
        Node node_4 = new Node(25);
        linkedList.head.value = 1;
        linkedList.head.next = node_1;
        node_1.next = node_2;
        linkedList_2.head.value = 2;
        linkedList_2.head.next = node_3;
        node_3.next = node_4;

        // When
        linkedList.append(linkedList_2);

        // Then
        assertThat(linkedList.size()).isEqualTo(5);
        Node current = linkedList.head;
        while( current.next != null){
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println(current.value);

    }

    @Test
    public void should_append_a_node_to_my_linkedlist() {

        // Given
        Node node_1 = new Node(15);
        Node node_2 = new Node(18);
        Node node_3 = new Node(20);

        linkedList.head.next = node_1;
        node_1.next = node_2;

        // When
        linkedList.append(node_3);

        // Then
        assertThat(linkedList.size()).isEqualTo(3);
        Node current = linkedList.head;
        while( current.next != null){
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println(current.value);

    }

    /*
     * Vérifier la suppression d'un element dans la liste a partir de sa valeur
     */
    @Test
    public void should_remove_node_with_value() {

        // Given
        int value = 18;
        Node node_1 = new Node(15);
        Node node_2 = new Node(18);
        Node node_3 = new Node(20);
        linkedList.head.next = node_1;
        node_1.next = node_2;
        node_2.next = node_3;

        // When
        linkedList.removeNodeWithValue(value);

        // Then
        assertThat(linkedList.size()).isEqualTo(2);
        Node current = linkedList.head;
        while( current.next != null){
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println(current.value);
    }

    /*
     * Vérifier la suppression d'un element dans la liste a partir de son index
     */
    @Test
    public void should_remove_node_at_index() {

        // Given
        int value = 2;
        Node node_1 = new Node(15);
        Node node_2 = new Node(18);
        Node node_3 = new Node(20);
        linkedList.head.next = node_1;
        node_1.next = node_2;
        node_2.next = node_3;

        // When
        linkedList.removeNodeAtIndex(value);

        // Then
        assertThat(linkedList.size()).isEqualTo(2);
        Node current = linkedList.head;
        while( current.next != null){
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println(current.value);
    }

    /*
     * Vérifier l'insertion d'un element a la tete de la liste
     */
    @Test
    public void should_insert_node_at_head() {

        // Given
        int value = 15;

        // When
        linkedList.insertAtHead(value);

        // Then
        assertThat(linkedList.size()).isEqualTo(1);
        assertThat(linkedList.head.value).isEqualTo(15);
    }

    /*
     * Vérifier l'insertion d'un element a la queue de la liste
     */
    @Test
    public void should_insert_node_at_tail() {

        // Given
        int value = 80;
        Node node_1 = new Node(15);
        Node node_2 = new Node(20);
        linkedList.head.next = node_1;
        node_1.next = node_2;

        // When
        linkedList.insertAtTail(value);

        // Then
        assertThat(linkedList.size()).isEqualTo(3);
        Node current = linkedList.head;
        while( current.next != null){
            current = current.next;
        }
        assertThat(current.value).isEqualTo(value);
    }

    /*
     * Vérifier l'insertion d'un element dans la liste a un index donné
     */
    @Test
    public void should_insert_element_in_linkedList() {

        // Given
        int value = 80;
        Node node_1 = new Node(15);
        Node node_2 = new Node(20);
        linkedList.head.next = node_1;
        node_1.next = node_2;

        // When
        linkedList.insertElement(1,value);

        // Then
        assertThat(linkedList.size()).isEqualTo(3);
        assertThat(linkedList.head.next.value).isEqualTo(value);
    }



}
