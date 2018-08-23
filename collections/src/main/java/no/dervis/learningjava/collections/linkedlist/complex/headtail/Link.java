package no.dervis.learningjava.collections.linkedlist.complex.headtail;

public interface Link {
    Object data();
    Link link();
    void linkTo(Link link);
}
