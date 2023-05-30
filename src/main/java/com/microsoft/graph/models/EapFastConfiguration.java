package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Available settings for EAP-FAST Configuration. */
public enum EapFastConfiguration implements ValuedEnum {
    /** Use EAP-FAST without Protected Access Credential (PAC). */
    NoProtectedAccessCredential("noProtectedAccessCredential"),
    /** Use Protected Access Credential (PAC). */
    UseProtectedAccessCredential("useProtectedAccessCredential"),
    /** Use Protected Access Credential (PAC) and Provision PAC. */
    UseProtectedAccessCredentialAndProvision("useProtectedAccessCredentialAndProvision"),
    /** Use Protected Access Credential (PAC), Provision PAC, and do so anonymously. */
    UseProtectedAccessCredentialAndProvisionAnonymously("useProtectedAccessCredentialAndProvisionAnonymously");
    public final String value;
    EapFastConfiguration(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EapFastConfiguration forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "noProtectedAccessCredential": return NoProtectedAccessCredential;
            case "useProtectedAccessCredential": return UseProtectedAccessCredential;
            case "useProtectedAccessCredentialAndProvision": return UseProtectedAccessCredentialAndProvision;
            case "useProtectedAccessCredentialAndProvisionAnonymously": return UseProtectedAccessCredentialAndProvisionAnonymously;
            default: return null;
        }
    }
}
