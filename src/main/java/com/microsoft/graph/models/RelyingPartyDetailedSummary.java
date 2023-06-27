package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RelyingPartyDetailedSummary extends Entity implements Parsable {
    /**
     * Number of failed sign in on Active Directory Federation Service in the period specified.
     */
    private Long failedSignInCount;
    /**
     * The migrationStatus property
     */
    private MigrationStatus migrationStatus;
    /**
     * Specifies all the validations check done on applications configuration details to evaluate if the application is ready to be moved to Azure AD.
     */
    private java.util.List<KeyValuePair> migrationValidationDetails;
    /**
     * This identifier is used to identify the relying party to this Federation Service. It is used when issuing claims to the relying party.
     */
    private String relyingPartyId;
    /**
     * Name of application or other entity on the internet that uses an identity provider to authenticate a user who wants to log in.
     */
    private String relyingPartyName;
    /**
     * Specifies where the relying party expects to receive the token.
     */
    private java.util.List<String> replyUrls;
    /**
     * Uniquely identifies the Active Directory forest.
     */
    private String serviceId;
    /**
     * Number of successful / (number of successful + number of failed sign ins) on Active Directory Federation Service in the period specified.
     */
    private Double signInSuccessRate;
    /**
     * Number of successful sign ins on Active Directory Federation Service.
     */
    private Long successfulSignInCount;
    /**
     * Number of successful + failed sign ins failed sign ins on Active Directory Federation Service in the period specified.
     */
    private Long totalSignInCount;
    /**
     * Number of unique users that have signed into the application.
     */
    private Long uniqueUserCount;
    /**
     * Instantiates a new RelyingPartyDetailedSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RelyingPartyDetailedSummary() {
        super();
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
        return this.failedSignInCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("failedSignInCount", (n) -> { this.setFailedSignInCount(n.getLongValue()); });
        deserializerMap.put("migrationStatus", (n) -> { this.setMigrationStatus(n.getEnumValue(MigrationStatus.class)); });
        deserializerMap.put("migrationValidationDetails", (n) -> { this.setMigrationValidationDetails(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("relyingPartyId", (n) -> { this.setRelyingPartyId(n.getStringValue()); });
        deserializerMap.put("relyingPartyName", (n) -> { this.setRelyingPartyName(n.getStringValue()); });
        deserializerMap.put("replyUrls", (n) -> { this.setReplyUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("serviceId", (n) -> { this.setServiceId(n.getStringValue()); });
        deserializerMap.put("signInSuccessRate", (n) -> { this.setSignInSuccessRate(n.getDoubleValue()); });
        deserializerMap.put("successfulSignInCount", (n) -> { this.setSuccessfulSignInCount(n.getLongValue()); });
        deserializerMap.put("totalSignInCount", (n) -> { this.setTotalSignInCount(n.getLongValue()); });
        deserializerMap.put("uniqueUserCount", (n) -> { this.setUniqueUserCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the migrationStatus property value. The migrationStatus property
     * @return a MigrationStatus
     */
    @javax.annotation.Nullable
    public MigrationStatus getMigrationStatus() {
        return this.migrationStatus;
    }
    /**
     * Gets the migrationValidationDetails property value. Specifies all the validations check done on applications configuration details to evaluate if the application is ready to be moved to Azure AD.
     * @return a KeyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getMigrationValidationDetails() {
        return this.migrationValidationDetails;
    }
    /**
     * Gets the relyingPartyId property value. This identifier is used to identify the relying party to this Federation Service. It is used when issuing claims to the relying party.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRelyingPartyId() {
        return this.relyingPartyId;
    }
    /**
     * Gets the relyingPartyName property value. Name of application or other entity on the internet that uses an identity provider to authenticate a user who wants to log in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRelyingPartyName() {
        return this.relyingPartyName;
    }
    /**
     * Gets the replyUrls property value. Specifies where the relying party expects to receive the token.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getReplyUrls() {
        return this.replyUrls;
    }
    /**
     * Gets the serviceId property value. Uniquely identifies the Active Directory forest.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceId() {
        return this.serviceId;
    }
    /**
     * Gets the signInSuccessRate property value. Number of successful / (number of successful + number of failed sign ins) on Active Directory Federation Service in the period specified.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getSignInSuccessRate() {
        return this.signInSuccessRate;
    }
    /**
     * Gets the successfulSignInCount property value. Number of successful sign ins on Active Directory Federation Service.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSuccessfulSignInCount() {
        return this.successfulSignInCount;
    }
    /**
     * Gets the totalSignInCount property value. Number of successful + failed sign ins failed sign ins on Active Directory Federation Service in the period specified.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTotalSignInCount() {
        return this.totalSignInCount;
    }
    /**
     * Gets the uniqueUserCount property value. Number of unique users that have signed into the application.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getUniqueUserCount() {
        return this.uniqueUserCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setFailedSignInCount(@javax.annotation.Nullable final Long value) {
        this.failedSignInCount = value;
    }
    /**
     * Sets the migrationStatus property value. The migrationStatus property
     * @param value Value to set for the migrationStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMigrationStatus(@javax.annotation.Nullable final MigrationStatus value) {
        this.migrationStatus = value;
    }
    /**
     * Sets the migrationValidationDetails property value. Specifies all the validations check done on applications configuration details to evaluate if the application is ready to be moved to Azure AD.
     * @param value Value to set for the migrationValidationDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMigrationValidationDetails(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.migrationValidationDetails = value;
    }
    /**
     * Sets the relyingPartyId property value. This identifier is used to identify the relying party to this Federation Service. It is used when issuing claims to the relying party.
     * @param value Value to set for the relyingPartyId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRelyingPartyId(@javax.annotation.Nullable final String value) {
        this.relyingPartyId = value;
    }
    /**
     * Sets the relyingPartyName property value. Name of application or other entity on the internet that uses an identity provider to authenticate a user who wants to log in.
     * @param value Value to set for the relyingPartyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRelyingPartyName(@javax.annotation.Nullable final String value) {
        this.relyingPartyName = value;
    }
    /**
     * Sets the replyUrls property value. Specifies where the relying party expects to receive the token.
     * @param value Value to set for the replyUrls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReplyUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this.replyUrls = value;
    }
    /**
     * Sets the serviceId property value. Uniquely identifies the Active Directory forest.
     * @param value Value to set for the serviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceId(@javax.annotation.Nullable final String value) {
        this.serviceId = value;
    }
    /**
     * Sets the signInSuccessRate property value. Number of successful / (number of successful + number of failed sign ins) on Active Directory Federation Service in the period specified.
     * @param value Value to set for the signInSuccessRate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSignInSuccessRate(@javax.annotation.Nullable final Double value) {
        this.signInSuccessRate = value;
    }
    /**
     * Sets the successfulSignInCount property value. Number of successful sign ins on Active Directory Federation Service.
     * @param value Value to set for the successfulSignInCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSuccessfulSignInCount(@javax.annotation.Nullable final Long value) {
        this.successfulSignInCount = value;
    }
    /**
     * Sets the totalSignInCount property value. Number of successful + failed sign ins failed sign ins on Active Directory Federation Service in the period specified.
     * @param value Value to set for the totalSignInCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalSignInCount(@javax.annotation.Nullable final Long value) {
        this.totalSignInCount = value;
    }
    /**
     * Sets the uniqueUserCount property value. Number of unique users that have signed into the application.
     * @param value Value to set for the uniqueUserCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUniqueUserCount(@javax.annotation.Nullable final Long value) {
        this.uniqueUserCount = value;
    }
}
