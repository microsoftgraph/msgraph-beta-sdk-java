package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TenantSetupInfo extends Entity implements Parsable {
    /** The defaultRolesSettings property */
    private PrivilegedRoleSettings _defaultRolesSettings;
    /** The firstTimeSetup property */
    private Boolean _firstTimeSetup;
    /** The relevantRolesSettings property */
    private java.util.List<String> _relevantRolesSettings;
    /** The setupStatus property */
    private SetupStatus _setupStatus;
    /** The skipSetup property */
    private Boolean _skipSetup;
    /** The userRolesActions property */
    private String _userRolesActions;
    /**
     * Instantiates a new TenantSetupInfo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TenantSetupInfo() {
        super();
        this.setOdataType("#microsoft.graph.tenantSetupInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TenantSetupInfo
     */
    @javax.annotation.Nonnull
    public static TenantSetupInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantSetupInfo();
    }
    /**
     * Gets the defaultRolesSettings property value. The defaultRolesSettings property
     * @return a privilegedRoleSettings
     */
    @javax.annotation.Nullable
    public PrivilegedRoleSettings getDefaultRolesSettings() {
        return this._defaultRolesSettings;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TenantSetupInfo currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultRolesSettings", (n) -> { currentObject.setDefaultRolesSettings(n.getObjectValue(PrivilegedRoleSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("firstTimeSetup", (n) -> { currentObject.setFirstTimeSetup(n.getBooleanValue()); });
        deserializerMap.put("relevantRolesSettings", (n) -> { currentObject.setRelevantRolesSettings(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("setupStatus", (n) -> { currentObject.setSetupStatus(n.getEnumValue(SetupStatus.class)); });
        deserializerMap.put("skipSetup", (n) -> { currentObject.setSkipSetup(n.getBooleanValue()); });
        deserializerMap.put("userRolesActions", (n) -> { currentObject.setUserRolesActions(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the firstTimeSetup property value. The firstTimeSetup property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirstTimeSetup() {
        return this._firstTimeSetup;
    }
    /**
     * Gets the relevantRolesSettings property value. The relevantRolesSettings property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRelevantRolesSettings() {
        return this._relevantRolesSettings;
    }
    /**
     * Gets the setupStatus property value. The setupStatus property
     * @return a setupStatus
     */
    @javax.annotation.Nullable
    public SetupStatus getSetupStatus() {
        return this._setupStatus;
    }
    /**
     * Gets the skipSetup property value. The skipSetup property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSkipSetup() {
        return this._skipSetup;
    }
    /**
     * Gets the userRolesActions property value. The userRolesActions property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserRolesActions() {
        return this._userRolesActions;
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
    @javax.annotation.Nonnull
    public void setDefaultRolesSettings(@javax.annotation.Nullable final PrivilegedRoleSettings value) {
        this._defaultRolesSettings = value;
    }
    /**
     * Sets the firstTimeSetup property value. The firstTimeSetup property
     * @param value Value to set for the firstTimeSetup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirstTimeSetup(@javax.annotation.Nullable final Boolean value) {
        this._firstTimeSetup = value;
    }
    /**
     * Sets the relevantRolesSettings property value. The relevantRolesSettings property
     * @param value Value to set for the relevantRolesSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRelevantRolesSettings(@javax.annotation.Nullable final java.util.List<String> value) {
        this._relevantRolesSettings = value;
    }
    /**
     * Sets the setupStatus property value. The setupStatus property
     * @param value Value to set for the setupStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSetupStatus(@javax.annotation.Nullable final SetupStatus value) {
        this._setupStatus = value;
    }
    /**
     * Sets the skipSetup property value. The skipSetup property
     * @param value Value to set for the skipSetup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkipSetup(@javax.annotation.Nullable final Boolean value) {
        this._skipSetup = value;
    }
    /**
     * Sets the userRolesActions property value. The userRolesActions property
     * @param value Value to set for the userRolesActions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRolesActions(@javax.annotation.Nullable final String value) {
        this._userRolesActions = value;
    }
}
