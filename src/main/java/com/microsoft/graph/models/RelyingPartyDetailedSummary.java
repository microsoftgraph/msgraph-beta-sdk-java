package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RelyingPartyDetailedSummary extends Entity implements Parsable {
    /** Number of failed sign in on Active Directory Federation Service in the period specified. */
    private Long _failedSignInCount;
    /** The migrationStatus property */
    private MigrationStatus _migrationStatus;
    /** Specifies all the validations check done on applications configuration details to evaluate if the application is ready to be moved to Azure AD. */
    private java.util.List<KeyValuePair> _migrationValidationDetails;
    /** This identifier is used to identify the relying party to this Federation Service. It is used when issuing claims to the relying party. */
    private String _relyingPartyId;
    /** Name of application or other entity on the internet that uses an identity provider to authenticate a user who wants to log in. */
    private String _relyingPartyName;
    /** Specifies where the relying party expects to receive the token. */
    private java.util.List<String> _replyUrls;
    /** Uniquely identifies the Active Directory forest. */
    private String _serviceId;
    /** Number of successful / (number of successful + number of failed sign ins) on Active Directory Federation Service in the period specified. */
    private Double _signInSuccessRate;
    /** Number of successful sign ins on Active Directory Federation Service. */
    private Long _successfulSignInCount;
    /** Number of successful + failed sign ins failed sign ins on Active Directory Federation Service in the period specified. */
    private Long _totalSignInCount;
    /** Number of unique users that have signed into the application. */
    private Long _uniqueUserCount;
    /**
     * Instantiates a new RelyingPartyDetailedSummary and sets the default values.
     * @return a void
     */
    public RelyingPartyDetailedSummary() {
        super();
        this.setOdataType("#microsoft.graph.relyingPartyDetailedSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RelyingPartyDetailedSummary
     */
    @javax.annotation.Nonnull
    public static RelyingPartyDetailedSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RelyingPartyDetailedSummary();
    }
    /**
     * Gets the failedSignInCount property value. Number of failed sign in on Active Directory Federation Service in the period specified.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getFailedSignInCount() {
        return this._failedSignInCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RelyingPartyDetailedSummary currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("failedSignInCount", (n) -> { currentObject.setFailedSignInCount(n.getLongValue()); });
            this.put("migrationStatus", (n) -> { currentObject.setMigrationStatus(n.getEnumValue(MigrationStatus.class)); });
            this.put("migrationValidationDetails", (n) -> { currentObject.setMigrationValidationDetails(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("relyingPartyId", (n) -> { currentObject.setRelyingPartyId(n.getStringValue()); });
            this.put("relyingPartyName", (n) -> { currentObject.setRelyingPartyName(n.getStringValue()); });
            this.put("replyUrls", (n) -> { currentObject.setReplyUrls(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("serviceId", (n) -> { currentObject.setServiceId(n.getStringValue()); });
            this.put("signInSuccessRate", (n) -> { currentObject.setSignInSuccessRate(n.getDoubleValue()); });
            this.put("successfulSignInCount", (n) -> { currentObject.setSuccessfulSignInCount(n.getLongValue()); });
            this.put("totalSignInCount", (n) -> { currentObject.setTotalSignInCount(n.getLongValue()); });
            this.put("uniqueUserCount", (n) -> { currentObject.setUniqueUserCount(n.getLongValue()); });
        }};
    }
    /**
     * Gets the migrationStatus property value. The migrationStatus property
     * @return a migrationStatus
     */
    @javax.annotation.Nullable
    public MigrationStatus getMigrationStatus() {
        return this._migrationStatus;
    }
    /**
     * Gets the migrationValidationDetails property value. Specifies all the validations check done on applications configuration details to evaluate if the application is ready to be moved to Azure AD.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getMigrationValidationDetails() {
        return this._migrationValidationDetails;
    }
    /**
     * Gets the relyingPartyId property value. This identifier is used to identify the relying party to this Federation Service. It is used when issuing claims to the relying party.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRelyingPartyId() {
        return this._relyingPartyId;
    }
    /**
     * Gets the relyingPartyName property value. Name of application or other entity on the internet that uses an identity provider to authenticate a user who wants to log in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRelyingPartyName() {
        return this._relyingPartyName;
    }
    /**
     * Gets the replyUrls property value. Specifies where the relying party expects to receive the token.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getReplyUrls() {
        return this._replyUrls;
    }
    /**
     * Gets the serviceId property value. Uniquely identifies the Active Directory forest.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceId() {
        return this._serviceId;
    }
    /**
     * Gets the signInSuccessRate property value. Number of successful / (number of successful + number of failed sign ins) on Active Directory Federation Service in the period specified.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getSignInSuccessRate() {
        return this._signInSuccessRate;
    }
    /**
     * Gets the successfulSignInCount property value. Number of successful sign ins on Active Directory Federation Service.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSuccessfulSignInCount() {
        return this._successfulSignInCount;
    }
    /**
     * Gets the totalSignInCount property value. Number of successful + failed sign ins failed sign ins on Active Directory Federation Service in the period specified.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTotalSignInCount() {
        return this._totalSignInCount;
    }
    /**
     * Gets the uniqueUserCount property value. Number of unique users that have signed into the application.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getUniqueUserCount() {
        return this._uniqueUserCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("failedSignInCount", this.getFailedSignInCount());
        writer.writeEnumValue("migrationStatus", this.getMigrationStatus());
        writer.writeCollectionOfObjectValues("migrationValidationDetails", this.getMigrationValidationDetails());
        writer.writeStringValue("relyingPartyId", this.getRelyingPartyId());
        writer.writeStringValue("relyingPartyName", this.getRelyingPartyName());
        writer.writeCollectionOfPrimitiveValues("replyUrls", this.getReplyUrls());
        writer.writeStringValue("serviceId", this.getServiceId());
        writer.writeDoubleValue("signInSuccessRate", this.getSignInSuccessRate());
        writer.writeLongValue("successfulSignInCount", this.getSuccessfulSignInCount());
        writer.writeLongValue("totalSignInCount", this.getTotalSignInCount());
        writer.writeLongValue("uniqueUserCount", this.getUniqueUserCount());
    }
    /**
     * Sets the failedSignInCount property value. Number of failed sign in on Active Directory Federation Service in the period specified.
     * @param value Value to set for the failedSignInCount property.
     * @return a void
     */
    public void setFailedSignInCount(@javax.annotation.Nullable final Long value) {
        this._failedSignInCount = value;
    }
    /**
     * Sets the migrationStatus property value. The migrationStatus property
     * @param value Value to set for the migrationStatus property.
     * @return a void
     */
    public void setMigrationStatus(@javax.annotation.Nullable final MigrationStatus value) {
        this._migrationStatus = value;
    }
    /**
     * Sets the migrationValidationDetails property value. Specifies all the validations check done on applications configuration details to evaluate if the application is ready to be moved to Azure AD.
     * @param value Value to set for the migrationValidationDetails property.
     * @return a void
     */
    public void setMigrationValidationDetails(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._migrationValidationDetails = value;
    }
    /**
     * Sets the relyingPartyId property value. This identifier is used to identify the relying party to this Federation Service. It is used when issuing claims to the relying party.
     * @param value Value to set for the relyingPartyId property.
     * @return a void
     */
    public void setRelyingPartyId(@javax.annotation.Nullable final String value) {
        this._relyingPartyId = value;
    }
    /**
     * Sets the relyingPartyName property value. Name of application or other entity on the internet that uses an identity provider to authenticate a user who wants to log in.
     * @param value Value to set for the relyingPartyName property.
     * @return a void
     */
    public void setRelyingPartyName(@javax.annotation.Nullable final String value) {
        this._relyingPartyName = value;
    }
    /**
     * Sets the replyUrls property value. Specifies where the relying party expects to receive the token.
     * @param value Value to set for the replyUrls property.
     * @return a void
     */
    public void setReplyUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this._replyUrls = value;
    }
    /**
     * Sets the serviceId property value. Uniquely identifies the Active Directory forest.
     * @param value Value to set for the serviceId property.
     * @return a void
     */
    public void setServiceId(@javax.annotation.Nullable final String value) {
        this._serviceId = value;
    }
    /**
     * Sets the signInSuccessRate property value. Number of successful / (number of successful + number of failed sign ins) on Active Directory Federation Service in the period specified.
     * @param value Value to set for the signInSuccessRate property.
     * @return a void
     */
    public void setSignInSuccessRate(@javax.annotation.Nullable final Double value) {
        this._signInSuccessRate = value;
    }
    /**
     * Sets the successfulSignInCount property value. Number of successful sign ins on Active Directory Federation Service.
     * @param value Value to set for the successfulSignInCount property.
     * @return a void
     */
    public void setSuccessfulSignInCount(@javax.annotation.Nullable final Long value) {
        this._successfulSignInCount = value;
    }
    /**
     * Sets the totalSignInCount property value. Number of successful + failed sign ins failed sign ins on Active Directory Federation Service in the period specified.
     * @param value Value to set for the totalSignInCount property.
     * @return a void
     */
    public void setTotalSignInCount(@javax.annotation.Nullable final Long value) {
        this._totalSignInCount = value;
    }
    /**
     * Sets the uniqueUserCount property value. Number of unique users that have signed into the application.
     * @param value Value to set for the uniqueUserCount property.
     * @return a void
     */
    public void setUniqueUserCount(@javax.annotation.Nullable final Long value) {
        this._uniqueUserCount = value;
    }
}
