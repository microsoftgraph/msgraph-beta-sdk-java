package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkforceIntegration extends ChangeTrackedEntity implements Parsable {
    /**
     * API version for the call back URL. Start with 1.
     */
    private Integer apiVersion;
    /**
     * Name of the workforce integration.
     */
    private String displayName;
    /**
     * The eligibilityFilteringEnabledEntities property
     */
    private EnumSet<EligibilityFilteringEnabledEntities> eligibilityFilteringEnabledEntities;
    /**
     * The workforce integration encryption resource.
     */
    private WorkforceIntegrationEncryption encryption;
    /**
     * Indicates whether this workforce integration is currently active and available.
     */
    private Boolean isActive;
    /**
     * This property has replaced supports in v1.0. We recommend that you use this property instead of supports. The supports property is still supported in beta for the time being. The possible values are: none, shift, swapRequest, openshift, openShiftRequest, userShiftPreferences, offerShiftRequest, unknownFutureValue, timeCard, timeOffReason, timeOff, timeOffRequest. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: timeCard, timeOffReason, timeOff, timeOffRequest. If selecting more than one value, all values must start with the first letter in uppercase.
     */
    private EnumSet<WorkforceIntegrationSupportedEntities> supportedEntities;
    /**
     * The Shifts entities supported for synchronous change notifications. Shifts will make a call back to the url provided on client changes on those entities added here. By default, no entities are supported for change notifications. The possible values are: none, shift, swapRequest, openshift, openShiftRequest, userShiftPreferences, offerShiftRequest, unknownFutureValue, timeCard, timeOffReason, timeOff, timeOffRequest. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: timeCard, timeOffReason, timeOff, timeOffRequest. If selecting more than one value, all values must start with the first letter in uppercase.
     */
    private EnumSet<WorkforceIntegrationSupportedEntities> supports;
    /**
     * Workforce Integration URL for callbacks from the Shifts service.
     */
    private String url;
    /**
     * Instantiates a new WorkforceIntegration and sets the default values.
     */
    public WorkforceIntegration() {
        super();
        this.setOdataType("#microsoft.graph.workforceIntegration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkforceIntegration
     */
    @jakarta.annotation.Nonnull
    public static WorkforceIntegration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkforceIntegration();
    }
    /**
     * Gets the apiVersion property value. API version for the call back URL. Start with 1.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getApiVersion() {
        return this.apiVersion;
    }
    /**
     * Gets the displayName property value. Name of the workforce integration.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the eligibilityFilteringEnabledEntities property value. The eligibilityFilteringEnabledEntities property
     * @return a EnumSet<EligibilityFilteringEnabledEntities>
     */
    @jakarta.annotation.Nullable
    public EnumSet<EligibilityFilteringEnabledEntities> getEligibilityFilteringEnabledEntities() {
        return this.eligibilityFilteringEnabledEntities;
    }
    /**
     * Gets the encryption property value. The workforce integration encryption resource.
     * @return a WorkforceIntegrationEncryption
     */
    @jakarta.annotation.Nullable
    public WorkforceIntegrationEncryption getEncryption() {
        return this.encryption;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("apiVersion", (n) -> { this.setApiVersion(n.getIntegerValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("eligibilityFilteringEnabledEntities", (n) -> { this.setEligibilityFilteringEnabledEntities(n.getEnumSetValue(EligibilityFilteringEnabledEntities.class)); });
        deserializerMap.put("encryption", (n) -> { this.setEncryption(n.getObjectValue(WorkforceIntegrationEncryption::createFromDiscriminatorValue)); });
        deserializerMap.put("isActive", (n) -> { this.setIsActive(n.getBooleanValue()); });
        deserializerMap.put("supportedEntities", (n) -> { this.setSupportedEntities(n.getEnumSetValue(WorkforceIntegrationSupportedEntities.class)); });
        deserializerMap.put("supports", (n) -> { this.setSupports(n.getEnumSetValue(WorkforceIntegrationSupportedEntities.class)); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isActive property value. Indicates whether this workforce integration is currently active and available.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsActive() {
        return this.isActive;
    }
    /**
     * Gets the supportedEntities property value. This property has replaced supports in v1.0. We recommend that you use this property instead of supports. The supports property is still supported in beta for the time being. The possible values are: none, shift, swapRequest, openshift, openShiftRequest, userShiftPreferences, offerShiftRequest, unknownFutureValue, timeCard, timeOffReason, timeOff, timeOffRequest. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: timeCard, timeOffReason, timeOff, timeOffRequest. If selecting more than one value, all values must start with the first letter in uppercase.
     * @return a EnumSet<WorkforceIntegrationSupportedEntities>
     */
    @jakarta.annotation.Nullable
    public EnumSet<WorkforceIntegrationSupportedEntities> getSupportedEntities() {
        return this.supportedEntities;
    }
    /**
     * Gets the supports property value. The Shifts entities supported for synchronous change notifications. Shifts will make a call back to the url provided on client changes on those entities added here. By default, no entities are supported for change notifications. The possible values are: none, shift, swapRequest, openshift, openShiftRequest, userShiftPreferences, offerShiftRequest, unknownFutureValue, timeCard, timeOffReason, timeOff, timeOffRequest. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: timeCard, timeOffReason, timeOff, timeOffRequest. If selecting more than one value, all values must start with the first letter in uppercase.
     * @return a EnumSet<WorkforceIntegrationSupportedEntities>
     */
    @jakarta.annotation.Nullable
    public EnumSet<WorkforceIntegrationSupportedEntities> getSupports() {
        return this.supports;
    }
    /**
     * Gets the url property value. Workforce Integration URL for callbacks from the Shifts service.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.url;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("apiVersion", this.getApiVersion());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumSetValue("eligibilityFilteringEnabledEntities", this.getEligibilityFilteringEnabledEntities());
        writer.writeObjectValue("encryption", this.getEncryption());
        writer.writeBooleanValue("isActive", this.getIsActive());
        writer.writeEnumSetValue("supportedEntities", this.getSupportedEntities());
        writer.writeEnumSetValue("supports", this.getSupports());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the apiVersion property value. API version for the call back URL. Start with 1.
     * @param value Value to set for the apiVersion property.
     */
    public void setApiVersion(@jakarta.annotation.Nullable final Integer value) {
        this.apiVersion = value;
    }
    /**
     * Sets the displayName property value. Name of the workforce integration.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the eligibilityFilteringEnabledEntities property value. The eligibilityFilteringEnabledEntities property
     * @param value Value to set for the eligibilityFilteringEnabledEntities property.
     */
    public void setEligibilityFilteringEnabledEntities(@jakarta.annotation.Nullable final EnumSet<EligibilityFilteringEnabledEntities> value) {
        this.eligibilityFilteringEnabledEntities = value;
    }
    /**
     * Sets the encryption property value. The workforce integration encryption resource.
     * @param value Value to set for the encryption property.
     */
    public void setEncryption(@jakarta.annotation.Nullable final WorkforceIntegrationEncryption value) {
        this.encryption = value;
    }
    /**
     * Sets the isActive property value. Indicates whether this workforce integration is currently active and available.
     * @param value Value to set for the isActive property.
     */
    public void setIsActive(@jakarta.annotation.Nullable final Boolean value) {
        this.isActive = value;
    }
    /**
     * Sets the supportedEntities property value. This property has replaced supports in v1.0. We recommend that you use this property instead of supports. The supports property is still supported in beta for the time being. The possible values are: none, shift, swapRequest, openshift, openShiftRequest, userShiftPreferences, offerShiftRequest, unknownFutureValue, timeCard, timeOffReason, timeOff, timeOffRequest. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: timeCard, timeOffReason, timeOff, timeOffRequest. If selecting more than one value, all values must start with the first letter in uppercase.
     * @param value Value to set for the supportedEntities property.
     */
    public void setSupportedEntities(@jakarta.annotation.Nullable final EnumSet<WorkforceIntegrationSupportedEntities> value) {
        this.supportedEntities = value;
    }
    /**
     * Sets the supports property value. The Shifts entities supported for synchronous change notifications. Shifts will make a call back to the url provided on client changes on those entities added here. By default, no entities are supported for change notifications. The possible values are: none, shift, swapRequest, openshift, openShiftRequest, userShiftPreferences, offerShiftRequest, unknownFutureValue, timeCard, timeOffReason, timeOff, timeOffRequest. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: timeCard, timeOffReason, timeOff, timeOffRequest. If selecting more than one value, all values must start with the first letter in uppercase.
     * @param value Value to set for the supports property.
     */
    public void setSupports(@jakarta.annotation.Nullable final EnumSet<WorkforceIntegrationSupportedEntities> value) {
        this.supports = value;
    }
    /**
     * Sets the url property value. Workforce Integration URL for callbacks from the Shifts service.
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.url = value;
    }
}
