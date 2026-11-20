package com.microsoft.graph.beta.models.security.contentmanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Content kind a repository can deploy. The tenant/E5 path deploys custom detections andDefender Workbooks; additional content kinds are added as the tenant path gains support.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RepositoryContentType implements ValuedEnum {
    /** Custom detection. */
    CustomDetection("customDetection"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue"),
    /** Defender workbook. */
    DefenderWorkbook("defenderWorkbook");
    public final String value;
    RepositoryContentType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RepositoryContentType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "customDetection": return CustomDetection;
            case "unknownFutureValue": return UnknownFutureValue;
            case "defenderWorkbook": return DefenderWorkbook;
            default: return null;
        }
    }
}
