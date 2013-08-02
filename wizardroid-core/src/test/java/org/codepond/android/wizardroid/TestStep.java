package org.codepond.android.wizardroid;

import java.util.Date;

/**
 * Dummy test step
 */
public class TestStep extends WizardStep {

    @ContextVariable
    private Date timestamp;

    public  TestStep() {

    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
