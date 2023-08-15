package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TenantSetupInfo extends Entity implements Parsable {
    /**
     * The defaultRolesSettings property
     */
    private PrivilegedRoleSettings defaultRolesSettings;
    /**
     * The firstTimeSetup property
     */
    private Boolean firstTimeSetup;
    /**
     * The relevantRolesSettings property
     */
    private java.util.List<String> relevantRolesSettings;
    /**
     * The setupStatus property
     */
    private SetupStatus setupStatus;
    /**
     * The skipSetup property
     */
    private Boolean skipSetup;
    /**
     * The userRolesActions property
     */
    private String userRolesActions;
    /**
     * Instantiates a new tenantSetupInfo and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public TenantSetupInfo() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenantSetupInfo
     */
    @jakarta.annotation.Nonnull
    public static TenantSetupInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantSetupInfo();
    }
    /**
     * Gets the defaultRolesSettings property value. The defaultRolesSettings property
     * @return a privilegedRoleSettings
     */
    @jakarta.annotation.Nullable
    public PrivilegedRoleSettings getDefaultRolesSettings() {
        return this.defaultRolesSettings;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultRolesSettings", (n) -> { this.setDefaultRolesSettings(n.getObjectValue(PrivilegedRoleSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("firstTimeSetup", (n) -> { this.setFirstTimeSetup(n.getBooleanValue()); });
        deserializerMap.put("relevantRolesSettings", (n) -> { this.setRelevantRolesSettings(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("setupStatus", (n) -> { this.setSetupStatus(n.getEnumValue(SetupStatus.class)); });
        deserializerMap.put("skipSetup", (n) -> { this.setSkipSetup(n.getBooleanValue()); });
        deserializerMap.put("userRolesActions", (n) -> { this.setUserRolesActions(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstTimeSetup property value. The firstTimeSetup property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirstTimeSetup() {
        return this.firstTimeSetup;
    }
    /**
     * Gets the relevantRolesSettings property value. The relevantRolesSettings property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRelevantRolesSettings() {
        return this.relevantRolesSettings;
    }
    /**
     * Gets the setupStatus property value. The setupStatus property
     * @return a setupStatus
     */
    @jakarta.annotation.Nullable
    public SetupStatus getSetupStatus() {
        return this.setupStatus;
    }
    /**
     * Gets the skipSetup property value. The skipSetup property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSkipSetup() {
        return this.skipSetup;
    }
    /**
     * Gets the userRolesActions property value. The userRolesActions property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserRolesActions() {
        return this.userRolesActions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDefaultRolesSettings(@jakarta.annotation.Nullable final PrivilegedRoleSettings value) {
        this.defaultRolesSettings = value;
    }
    /**
     * Sets the firstTimeSetup property value. The firstTimeSetup property
     * @param value Value to set for the firstTimeSetup property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFirstTimeSetup(@jakarta.annotation.Nullable final Boolean value) {
        this.firstTimeSetup = value;
    }
    /**
     * Sets the relevantRolesSettings property value. The relevantRolesSettings property
     * @param value Value to set for the relevantRolesSettings property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRelevantRolesSettings(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.relevantRolesSettings = value;
    }
    /**
     * Sets the setupStatus property value. The setupStatus property
     * @param value Value to set for the setupStatus property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSetupStatus(@jakarta.annotation.Nullable final SetupStatus value) {
        this.setupStatus = value;
    }
    /**
     * Sets the skipSetup property value. The skipSetup property
     * @param value Value to set for the skipSetup property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSkipSetup(@jakarta.annotation.Nullable final Boolean value) {
        this.skipSetup = value;
    }
    /**
     * Sets the userRolesActions property value. The userRolesActions property
     * @param value Value to set for the userRolesActions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserRolesActions(@jakarta.annotation.Nullable final String value) {
        this.userRolesActions = value;
    }
}
