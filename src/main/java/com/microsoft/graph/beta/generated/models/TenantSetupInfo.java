package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TenantSetupInfo extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TenantSetupInfo} and sets the default values.
     */
    public TenantSetupInfo() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TenantSetupInfo}
     */
    @jakarta.annotation.Nonnull
    public static TenantSetupInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantSetupInfo();
    }
    /**
     * Gets the defaultRolesSettings property value. The defaultRolesSettings property
     * @return a {@link PrivilegedRoleSettings}
     */
    @jakarta.annotation.Nullable
    public PrivilegedRoleSettings getDefaultRolesSettings() {
        return this.backingStore.get("defaultRolesSettings");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultRolesSettings", (n) -> { this.setDefaultRolesSettings(n.getObjectValue(PrivilegedRoleSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("firstTimeSetup", (n) -> { this.setFirstTimeSetup(n.getBooleanValue()); });
        deserializerMap.put("relevantRolesSettings", (n) -> { this.setRelevantRolesSettings(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("setupStatus", (n) -> { this.setSetupStatus(n.getEnumValue(SetupStatus::forValue)); });
        deserializerMap.put("skipSetup", (n) -> { this.setSkipSetup(n.getBooleanValue()); });
        deserializerMap.put("userRolesActions", (n) -> { this.setUserRolesActions(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstTimeSetup property value. The firstTimeSetup property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFirstTimeSetup() {
        return this.backingStore.get("firstTimeSetup");
    }
    /**
     * Gets the relevantRolesSettings property value. The relevantRolesSettings property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRelevantRolesSettings() {
        return this.backingStore.get("relevantRolesSettings");
    }
    /**
     * Gets the setupStatus property value. The setupStatus property
     * @return a {@link SetupStatus}
     */
    @jakarta.annotation.Nullable
    public SetupStatus getSetupStatus() {
        return this.backingStore.get("setupStatus");
    }
    /**
     * Gets the skipSetup property value. The skipSetup property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSkipSetup() {
        return this.backingStore.get("skipSetup");
    }
    /**
     * Gets the userRolesActions property value. The userRolesActions property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserRolesActions() {
        return this.backingStore.get("userRolesActions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("defaultRolesSettings", this.getDefaultRolesSettings());
        writer.writeBooleanValue("firstTimeSetup", this.getFirstTimeSetup());
        writer.writeCollectionOfPrimitiveValues("relevantRolesSettings", this.getRelevantRolesSettings());
        writer.writeEnumValue("setupStatus", this.getSetupStatus());
        writer.writeBooleanValue("skipSetup", this.getSkipSetup());
        writer.writeStringValue("userRolesActions", this.getUserRolesActions());
    }
    /**
     * Sets the defaultRolesSettings property value. The defaultRolesSettings property
     * @param value Value to set for the defaultRolesSettings property.
     */
    public void setDefaultRolesSettings(@jakarta.annotation.Nullable final PrivilegedRoleSettings value) {
        this.backingStore.set("defaultRolesSettings", value);
    }
    /**
     * Sets the firstTimeSetup property value. The firstTimeSetup property
     * @param value Value to set for the firstTimeSetup property.
     */
    public void setFirstTimeSetup(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("firstTimeSetup", value);
    }
    /**
     * Sets the relevantRolesSettings property value. The relevantRolesSettings property
     * @param value Value to set for the relevantRolesSettings property.
     */
    public void setRelevantRolesSettings(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("relevantRolesSettings", value);
    }
    /**
     * Sets the setupStatus property value. The setupStatus property
     * @param value Value to set for the setupStatus property.
     */
    public void setSetupStatus(@jakarta.annotation.Nullable final SetupStatus value) {
        this.backingStore.set("setupStatus", value);
    }
    /**
     * Sets the skipSetup property value. The skipSetup property
     * @param value Value to set for the skipSetup property.
     */
    public void setSkipSetup(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("skipSetup", value);
    }
    /**
     * Sets the userRolesActions property value. The userRolesActions property
     * @param value Value to set for the userRolesActions property.
     */
    public void setUserRolesActions(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userRolesActions", value);
    }
}
