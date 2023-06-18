public class Main {
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        Service.checkLoginAndPassword(list, "sadasads", "as123_a2A", "as123_a2A");
        Service.checkLoginAndPassword(list, "sadasMads", "as123_a2A", "as123_a2A");
        Service.checkLoginAndPassword(list, "123sadasads", "as123_a2A", "as123_a2A");
        Service.checkLoginAndPassword(list, "sa__dasads", "as1asd123_a2A", "as1asd123_a2A");
        LinkedList.printList(list);

        Service.checkLoginAndPassword(list, "sa__dasaasdasasd2312Ssdasdds", "as1asd123_a2A", "as1asd123_a2A");
        Service.checkLoginAndPassword(list, "sa__dasaasds", "as1asderwerwerwerwer123_a2A", "as1asderwerwerwerwer123_a2A");
        Service.checkLoginAndPassword(list, "sa__dasaasds", "as1erwerwer123_a2A", "as1aa2A");

        LinkedList.deleteByKey(list, "sadasads");
        LinkedList.deleteByKey(list, "sadasadasdasdds");
        LinkedList.printList(list);
    }
}
