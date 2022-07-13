package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RiskyServicePrincipal extends Entity implements Parsable {
    /** true if the service principal account is enabled; otherwise, false. */
    private Boolean _accountEnabled;
    /** The globally unique identifier for the associated application (its appId property), if any. */
    private String _appId;
    /** The display name for the service principal. */
    private String _displayName;
    /** Represents the risk history of Azure AD service principals. */
    private java.util.List<RiskyServicePrincipalHistoryItem> _history;
    /** Indicates whether Azure AD is currently processing the service principal's risky state. */
    private Boolean _isProcessing;
    /** Details of the detected risk. Note: Details for this property are only available for Azure AD Premium P2 customers. P1 customers will be returned hidden. The possible values are: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden,  adminConfirmedUserCompromised, unknownFutureValue, adminConfirmedServicePrincipalCompromised, adminDismissedAllRiskForServicePrincipal. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: adminConfirmedServicePrincipalCompromised , adminDismissedAllRiskForServicePrincipal. */
    private RiskDetail _riskDetail;
    /** The date and time that the risk state was last updated. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2021 is 2021-01-01T00:00:00Z. Supports $filter (eq). */
    private OffsetDateTime _riskLastUpdatedDateTime;
    /** Level of the detected risky workload identity. The possible values are: low, medium, high, hidden, none, unknownFutureValue. Supports $filter (eq). */
    private RiskLevel _riskLevel;
    /** State of the service principal's risk. The possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue. */
    private RiskState _riskState;
    /** Identifies whether the service principal represents an Application, a ManagedIdentity, or a legacy application (socialIdp). This is set by Azure AD internally and is inherited from servicePrincipal. */
    private String _servicePrincipalType;
    /**
     * Instantiates a new RiskyServicePrincipal and sets the default values.
     * @return a void
     */
    public RiskyServicePrincipal() {
        super();
        this.setType("#microsoft.graph.riskyServicePrincipal");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RiskyServicePrincipal
     */
    @javax.annotation.Nonnull
    public static RiskyServicePrincipal createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.riskyServicePrincipalHistoryItem": return new RiskyServicePrincipalHistoryItem();
            }
        }
        return new RiskyServicePrincipal();
    }
    /**
     * Gets the accountEnabled property value. true if the service principal account is enabled; otherwise, false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAccountEnabled() {
        return this._accountEnabled;
    }
    /**
     * Gets the appId property value. The globally unique identifier for the associated application (its appId property), if any.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this._appId;
    }
    /**
     * Gets the displayName property value. The display name for the service principal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RiskyServicePrincipal currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("accountEnabled", (n) -> { currentObject.setAccountEnabled(n.getBooleanValue()); });
            this.put("appId", (n) -> { currentObject.setAppId(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("history", (n) -> { currentObject.setHistory(n.getCollectionOfObjectValues(RiskyServicePrincipalHistoryItem::createFromDiscriminatorValue)); });
            this.put("isProcessing", (n) -> { currentObject.setIsProcessing(n.getBooleanValue()); });
            this.put("riskDetail", (n) -> { currentObject.setRiskDetail(n.getEnumValue(RiskDetail.class)); });
            this.put("riskLastUpdatedDateTime", (n) -> { currentObject.setRiskLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("riskLevel", (n) -> { currentObject.setRiskLevel(n.getEnumValue(RiskLevel.class)); });
            this.put("riskState", (n) -> { currentObject.setRiskState(n.getEnumValue(RiskState.class)); });
            this.put("servicePrincipalType", (n) -> { currentObject.setServicePrincipalType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the history property value. Represents the risk history of Azure AD service principals.
     * @return a riskyServicePrincipalHistoryItem
     */
    @javax.annotation.Nullable
    public java.util.List<RiskyServicePrincipalHistoryItem> getHistory() {
        return this._history;
    }
    /**
     * Gets the isProcessing property value. Indicates whether Azure AD is currently processing the service principal's risky state.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsProcessing() {
        return this._isProcessing;
    }
    /**
     * Gets the riskDetail property value. Details of the detected risk. Note: Details for this property are only available for Azure AD Premium P2 customers. P1 customers will be returned hidden. The possible values are: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden,  adminConfirmedUserCompromised, unknownFutureValue, adminConfirmedServicePrincipalCompromised, adminDismissedAllRiskForServicePrincipal. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: adminConfirmedServicePrincipalCompromised , adminDismissedAllRiskForServicePrincipal.
     * @return a riskDetail
     */
    @javax.annotation.Nullable
    public RiskDetail getRiskDetail() {
        return this._riskDetail;
    }
    /**
     * Gets the riskLastUpdatedDateTime property value. The date and time that the risk state was last updated. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2021 is 2021-01-01T00:00:00Z. Supports $filter (eq).
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRiskLastUpdatedDateTime() {
        return this._riskLastUpdatedDateTime;
    }
    /**
     * Gets the riskLevel property value. Level of the detected risky workload identity. The possible values are: low, medium, high, hidden, none, unknownFutureValue. Supports $filter (eq).
     * @return a riskLevel
     */
    @javax.annotation.Nullable
    public RiskLevel getRiskLevel() {
        return this._riskLevel;
    }
    /**
     * Gets the riskState property value. State of the service principal's risk. The possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue.
     * @return a riskState
     */
    @javax.annotation.Nullable
    public RiskState getRiskState() {
        return this._riskState;
    }
    /**
     * Gets the servicePrincipalType property value. Identifies whether the service principal represents an Application, a ManagedIdentity, or a legacy application (socialIdp). This is set by Azure AD internally and is inherited from servicePrincipal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePrincipalType() {
        return this._servicePrincipalType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("accountEnabled", this.getAccountEnabled());
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("history", this.getHistory());
        writer.writeBooleanValue("isProcessing", this.getIsProcessing());
        writer.writeEnumValue("riskDetail", this.getRiskDetail());
        writer.writeOffsetDateTimeValue("riskLastUpdatedDateTime", this.getRiskLastUpdatedDateTime());
        writer.writeEnumValue("riskLevel", this.getRiskLevel());
        writer.writeEnumValue("riskState", this.getRiskState());
        writer.writeStringValue("servicePrincipalType", this.getServicePrincipalType());
    }
    /**
     * Sets the accountEnabled property value. true if the service principal account is enabled; otherwise, false.
     * @param value Value to set for the accountEnabled property.
     * @return a void
     */
    public void setAccountEnabled(@javax.annotation.Nullable final Boolean value) {
        this._accountEnabled = value;
    }
    /**
     * Sets the appId property value. The globally unique identifier for the associated application (its appId property), if any.
     * @param value Value to set for the appId property.
     * @return a void
     */
    public void setAppId(@javax.annotation.Nullable final String value) {
        this._appId = value;
    }
    /**
     * Sets the displayName property value. The display name for the service principal.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the history property value. Represents the risk history of Azure AD service principals.
     * @param value Value to set for the history property.
     * @return a void
     */
    public void setHistory(@javax.annotation.Nullable final java.util.List<RiskyServicePrincipalHistoryItem> value) {
        this._history = value;
    }
    /**
     * Sets the isProcessing property value. Indicates whether Azure AD is currently processing the service principal's risky state.
     * @param value Value to set for the isProcessing property.
     * @return a void
     */
    public void setIsProcessing(@javax.annotation.Nullable final Boolean value) {
        this._isProcessing = value;
    }
    /**
     * Sets the riskDetail property value. Details of the detected risk. Note: Details for this property are only available for Azure AD Premium P2 customers. P1 customers will be returned hidden. The possible values are: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden,  adminConfirmedUserCompromised, unknownFutureValue, adminConfirmedServicePrincipalCompromised, adminDismissedAllRiskForServicePrincipal. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: adminConfirmedServicePrincipalCompromised , adminDismissedAllRiskForServicePrincipal.
     * @param value Value to set for the riskDetail property.
     * @return a void
     */
    public void setRiskDetail(@javax.annotation.Nullable final RiskDetail value) {
        this._riskDetail = value;
    }
    /**
     * Sets the riskLastUpdatedDateTime property value. The date and time that the risk state was last updated. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2021 is 2021-01-01T00:00:00Z. Supports $filter (eq).
     * @param value Value to set for the riskLastUpdatedDateTime property.
     * @return a void
     */
    public void setRiskLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._riskLastUpdatedDateTime = value;
    }
    /**
     * Sets the riskLevel property value. Level of the detected risky workload identity. The possible values are: low, medium, high, hidden, none, unknownFutureValue. Supports $filter (eq).
     * @param value Value to set for the riskLevel property.
     * @return a void
     */
    public void setRiskLevel(@javax.annotation.Nullable final RiskLevel value) {
        this._riskLevel = value;
    }
    /**
     * Sets the riskState property value. State of the service principal's risk. The possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue.
     * @param value Value to set for the riskState property.
     * @return a void
     */
    public void setRiskState(@javax.annotation.Nullable final RiskState value) {
        this._riskState = value;
    }
    /**
     * Sets the servicePrincipalType property value. Identifies whether the service principal represents an Application, a ManagedIdentity, or a legacy application (socialIdp). This is set by Azure AD internally and is inherited from servicePrincipal.
     * @param value Value to set for the servicePrincipalType property.
     * @return a void
     */
    public void setServicePrincipalType(@javax.annotation.Nullable final String value) {
        this._servicePrincipalType = value;
    }
}
