package org.ObjectLayout.examples;/*
 * Written by Gil Tene and Martin Thompson, and released to the public domain,
 * as explained at http://creativecommons.org/publicdomain/zero/1.0/
 */

import org.ObjectLayout.StructuredArray;

import java.util.concurrent.atomic.AtomicLong;

/**
 * A simple, minimalistic example of a non-generic subclass of StructuredArray&lt;AtomicLong&gt;.
 */
public class StructuredArrayOfAtomicLong extends StructuredArray<AtomicLong> {

    public static StructuredArrayOfAtomicLong newInstance(final long length) {
        return StructuredArray.newInstance(StructuredArrayOfAtomicLong.class, AtomicLong.class, length);
    }

    public AtomicLong get(long index) {
        return super.get(index);
    }
}
