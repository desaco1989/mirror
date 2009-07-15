package net.vidageek.mirror.provider;

import net.vidageek.mirror.provider.java.PureJavaReflectionProvider;

import org.junit.experimental.theories.DataPoint;

/**
 * Interface to provide datapoints to JUnit's Theory.
 * 
 * @author jonasabreu
 */
public interface ReflectionProviderDataPointList {

    @DataPoint
    public ReflectionProvider pureJava = new PureJavaReflectionProvider();

}
