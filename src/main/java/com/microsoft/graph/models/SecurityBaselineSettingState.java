package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The security baseline compliance state of a setting for a device
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SecurityBaselineSettingState extends Entity implements Parsable {
    /**
     * Instantiates a new SecurityBaselineSettingState and sets the default values.
     */
    public SecurityBaselineSettingState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SecurityBaselineSettingState
     */
    @jakarta.annotation.Nonnull
    public static SecurityBaselineSettingState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityBaselineSettingState();
    }
    /**
     * Gets the contributingPolicies property value. The policies that contribute to this setting instance
     * @return a java.util.List<SecurityBaselineContributingPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecurityBaselineContributingPolicy> getContributingPolicies() {
        return this.backingStore.get("contributingPolicies");
    }
    /**
     * Gets the errorCode property value. The error code if the setting is in error state
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getErrorCode() {
        return this.backingStore.get("errorCode");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contributingPolicies", (n) -> { this.setContributingPolicies(n.getCollectionOfObjectValues(SecurityBaselineContributingPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getStringValue()); });
        deserializerMap.put("settingCategoryId", (n) -> { this.setSettingCategoryId(n.getStringValue()); });
        deserializerMap.put("settingCategoryName", (n) -> { this.setSettingCategoryName(n.getStringValue()); });
        deserializerMap.put("settingId", (n) -> { this.setSettingId(n.getStringValue()); });
        deserializerMap.put("settingName", (n) -> { this.setSettingName(n.getStringValue()); });
        deserializerMap.put("sourcePolicies", (n) -> { this.setSourcePolicies(n.getCollectionOfObjectValues(SettingSource::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(SecurityBaselineComplianceState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the settingCategoryId property value. The setting category id which this setting belongs to
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSettingCategoryId() {
        return this.backingStore.get("settingCategoryId");
    }
    /**
     * Gets the settingCategoryName property value. The setting category name which this setting belongs to
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSettingCategoryName() {
        return this.backingStore.get("settingCategoryName");
    }
    /**
     * Gets the settingId property value. The setting id guid
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSettingId() {
        return this.backingStore.get("settingId");
    }
    /**
     * Gets the settingName property value. The setting name that is being reported
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSettingName() {
        return this.backingStore.get("settingName");
    }
    /**
     * Gets the sourcePolicies property value. The policies that contribute to this setting instance
     * @return a java.util.List<SettingSource>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SettingSource> getSourcePolicies() {
        return this.backingStore.get("sourcePolicies");
    }
    /**
     * Gets the state property value. Security Baseline Compliance State
     * @return a SecurityBaselineComplianceState
     */
    @jakarta.annotation.Nullable
    public SecurityBaselineComplianceState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("contributingPolicies", this.getContributingPolicies());
        writer.writeStringValue("errorCode", this.getErrorCode());
        writer.writeStringValue("settingCategoryId", this.getSettingCategoryId());
        writer.writeStringValue("settingCategoryName", this.getSettingCategoryName());
        writer.writeStringValue("settingId", this.getSettingId());
        writer.writeStringValue("settingName", this.getSettingName());
        writer.writeCollectionOfObjectValues("sourcePolicies", this.getSourcePolicies());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the contributingPolicies property value. The policies that contribute to this setting instance
     * @param value Value to set for the contributingPolicies property.
     */
    public void setContributingPolicies(@jakarta.annotation.Nullable final java.util.List<SecurityBaselineContributingPolicy> value) {
        this.backingStore.set("contributingPolicies", value);
    }
    /**
     * Sets the errorCode property value. The error code if the setting is in error state
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("errorCode", value);
    }
    /**
     * Sets the settingCategoryId property value. The setting category id which this setting belongs to
     * @param value Value to set for the settingCategoryId property.
     */
    public void setSettingCategoryId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("settingCategoryId", value);
    }
    /**
     * Sets the settingCategoryName property value. The setting category name which this setting belongs to
     * @param value Value to set for the settingCategoryName property.
     */
    public void setSettingCategoryName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("settingCategoryName", value);
    }
    /**
     * Sets the settingId property value. The setting id guid
     * @param value Value to set for the settingId property.
     */
    public void setSettingId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("settingId", value);
    }
    /**
     * Sets the settingName property value. The setting name that is being reported
     * @param value Value to set for the settingName property.
     */
    public void setSettingName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("settingName", value);
    }
    /**
     * Sets the sourcePolicies property value. The policies that contribute to this setting instance
     * @param value Value to set for the sourcePolicies property.
     */
    public void setSourcePolicies(@jakarta.annotation.Nullable final java.util.List<SettingSource> value) {
        this.backingStore.set("sourcePolicies", value);
    }
    /**
     * Sets the state property value. Security Baseline Compliance State
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final SecurityBaselineComplianceState value) {
        this.backingStore.set("state", value);
    }
}
