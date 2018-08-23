package no.dervis.learningjava.collections.linkedlist.complex.util;

import no.dervis.learningjava.collections.linkedlist.complex.headtail.Link;
import no.dervis.learningjava.collections.linkedlist.complex.headtail.LinkList;
import no.dervis.learningjava.collections.linkedlist.complex.headtail_generics.GenericLink;
import no.dervis.learningjava.collections.linkedlist.complex.headtail_generics.GenericLinkList;

public class ListUtil {

    public static String printList(LinkList list) {
        return printList(toGenericList(list));
    }

    public static String printList(GenericLinkList list) {
        if (list.size() == 0) return "[]";

        StringBuilder buffer = new StringBuilder();
        buffer.append("[").append(System.lineSeparator());

        GenericLink item = list.first();
        while(item.link() != null) {
            buffer.append(item.getClass().getSimpleName()).append(':').append(item.data()).append(System.lineSeparator());
            item = item.link();
        }
        buffer.append(item.getClass().getSimpleName()).append(':').append(item.data()).append(System.lineSeparator());
        buffer.append("]");

        return buffer.toString();
    }

    public static GenericLinkList toGenericList(LinkList list) {
        GenericLinkList<Object> glist = new GenericLinkList<>();
        Link item = list.first();
        while(item != null) {
            glist.addLast(item.data());
            item = item.link();
        }
        return glist;
    }


//    public static GenericLinkList toGenericList(GenericSimpleLinkList list) {
//        GenericLinkList<Object> glist = new GenericLinkList<>();
//        Item item = list.first();
//        while(item.getNext() != null) {
//            glist.addLast(item.getObject());
//            item = item.getNext();
//        }
//        glist.addLast(item.getObject());
//        return glist;
//    }

}
