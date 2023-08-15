package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum HuntingRuleErrorCode implements ValuedEnum {
    QueryExecutionFailed("queryExecutionFailed"),
    QueryExecutionThrottling("queryExecutionThrottling"),
    QueryExceededResultSize("queryExceededResultSize"),
    QueryLimitsExceeded("queryLimitsExceeded"),
    QueryTimeout("queryTimeout"),
    AlertCreationFailed("alertCreationFailed"),
    AlertReportNotFound("alertReportNotFound"),
    PartialRowsFailed("partialRowsFailed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    HuntingRuleErrorCode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static HuntingRuleErrorCode forValue(@javax.annotation.Nonnull final String searchValue) {
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
            default: return null;
        }
    }
}
