package com.sfl.overheid.api.impl;

import com.sfl.overheid.api.configuration.OverheidJerseyClientBuilder;
import com.sfl.overheid.api.configuration.impl.OverheidJerseyClientBuilderImpl;
import com.sfl.overheid.api.test.AbstractOverheidUniTest;
import org.easymock.TestSubject;
import org.junit.Test;

import javax.ws.rs.client.Client;

import static org.junit.Assert.assertNotNull;

/**
 * User: Arthur Asatryan
 * Company: SFL LLC
 * Date: 10/6/16
 * Time: 3:14 PM
 */
public class OverheidJerseyClientBuilderImplTest extends AbstractOverheidUniTest {

    //region Test subject and mocks
    @TestSubject
    private final OverheidJerseyClientBuilder overheidJerseyClientBuilder = new OverheidJerseyClientBuilderImpl();
    //endregion

    //region Constructors
    public OverheidJerseyClientBuilderImplTest() {
    }
    //endregion

    //region Test methods
    @Test
    public void testBuild() {
        resetAll();
        // test data
        // expectations
        replayAll();
        final Client result = overheidJerseyClientBuilder.build();
        assertNotNull(result);
        verifyAll();
    }
    //endregion
}