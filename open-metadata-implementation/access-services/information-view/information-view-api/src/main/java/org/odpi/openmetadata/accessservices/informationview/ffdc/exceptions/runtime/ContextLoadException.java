/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.accessservices.informationview.ffdc.exceptions.runtime;

public class ContextLoadException extends InformationViewExceptionBase {

    public ContextLoadException(String className, String errorMessage, String systemAction, String userAction,
                                Throwable caughtError) {
        super(className, errorMessage, systemAction, userAction, caughtError);
    }

    public ContextLoadException(int httpErrorCode, String reportingClassName, String reportedErrorMessage,
                                String reportedSystemAction, String reportedUserAction,
                                Throwable reportedCaughtException) {
        super(httpErrorCode, reportingClassName, reportedErrorMessage, reportedSystemAction, reportedUserAction,
                reportedCaughtException);
    }
}
