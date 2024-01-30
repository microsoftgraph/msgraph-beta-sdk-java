package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum HuntingRuleErrorCode implements ValuedEnum {
    QueryExecutionFailed("queryExecutionFailed"),
    QueryExecutionThrottling("queryExecutionThrottling"),
    QueryExceededResultSize("queryExceededResultSize"),
    QueryLimitsExceeded("queryLimitsExceeded"),
    QueryTimeout("queryTimeout"),
    AlertCreationFailed("alertCreationFailed"),
    AlertReportNotFound("alertReportNotFound"),
    PartialRowsFailed("partialRowsFailed"),
    UnknownFutureValue("unknownFutureValue"),
    NoImpactedEntity("noImpactedEntity");
    public final String value;
    HuntingRuleErrorCode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static HuntingRuleErrorCode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "queryExecutionFailed": return QueryExecutionFailed;
            case "queryExecutionThrottling": return QueryExecutionThrottling;
            case "queryExceededResultSize": return QueryExceededResultSize;
            case "queryLimitsExceeded": return QueryLimitsExceeded;
            case "queryTimeout": return QueryTimeout;
            case "alertCreationFailed": return AlertCreationFailed;
            case "alertReportNotFound": return AlertReportNotFound;
            case "partialRowsFailed": return PartialRowsFailed;
            case "unknownFutureValue": return UnknownFutureValue;
            case "noImpactedEntity": return NoImpactedEntity;
            default: return null;
        }
    }
}
