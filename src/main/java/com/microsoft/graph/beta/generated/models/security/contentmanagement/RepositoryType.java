package com.microsoft.graph.beta.models.security.contentmanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Source-control provider.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RepositoryType implements ValuedEnum {
    /** GitHub. */
    GitHub("gitHub"),
    /** Azure DevOps. */
    AzureDevOps("azureDevOps"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RepositoryType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RepositoryType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "gitHub": return GitHub;
            case "azureDevOps": return AzureDevOps;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
