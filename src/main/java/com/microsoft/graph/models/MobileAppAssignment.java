package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** A class containing the properties used for Group Assignment of a Mobile App. */
public class MobileAppAssignment extends Entity implements Parsable {
    /** Possible values for the install intent chosen by the admin. */
    private InstallIntent _intent;
    /** The settings for target assignment defined by the admin. */
    private MobileAppAssignmentSettings _settings;
    /** Represents source of assignment. */
    private DeviceAndAppManagementAssignmentSource _source;
    /** The identifier of the source of the assignment. */
    private String _sourceId;
    /** The target group assignment defined by the admin. */
    private DeviceAndAppManagementAssignmentTarget _target;
    /**
     * Instantiates a new mobileAppAssignment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MobileAppAssignment() {
        super();
        this.setOdataType("#microsoft.graph.mobileAppAssignment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppAssignment
     */
    @javax.annotation.Nonnull
    public static MobileAppAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MobileAppAssignment currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("intent", (n) -> { currentObject.setIntent(n.getEnumValue(InstallIntent.class)); });
            this.put("settings", (n) -> { currentObject.setSettings(n.getObjectValue(MobileAppAssignmentSettings::createFromDiscriminatorValue)); });
            this.put("source", (n) -> { currentObject.setSource(n.getEnumValue(DeviceAndAppManagementAssignmentSource.class)); });
            this.put("sourceId", (n) -> { currentObject.setSourceId(n.getStringValue()); });
            this.put("target", (n) -> { currentObject.setTarget(n.getObjectValue(DeviceAndAppManagementAssignmentTarget::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the intent property value. Possible values for the install intent chosen by the admin.
     * @return a installIntent
     */
    @javax.annotation.Nullable
    public InstallIntent getIntent() {
        return this._intent;
    }
    /**
     * Gets the settings property value. The settings for target assignment defined by the admin.
     * @return a mobileAppAssignmentSettings
     */
    @javax.annotation.Nullable
    public MobileAppAssignmentSettings getSettings() {
        return this._settings;
    }
    /**
     * Gets the source property value. Represents source of assignment.
     * @return a deviceAndAppManagementAssignmentSource
     */
    @javax.annotation.Nullable
    public DeviceAndAppManagementAssignmentSource getSource() {
        return this._source;
    }
    /**
     * Gets the sourceId property value. The identifier of the source of the assignment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceId() {
        return this._sourceId;
    }
    /**
     * Gets the target property value. The target group assignment defined by the admin.
     * @return a deviceAndAppManagementAssignmentTarget
     */
    @javax.annotation.Nullable
    public DeviceAndAppManagementAssignmentTarget getTarget() {
        return this._target;
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
        writer.writeEnumValue("intent", this.getIntent());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeEnumValue("source", this.getSource());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the intent property value. Possible values for the install intent chosen by the admin.
     * @param value Value to set for the intent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntent(@javax.annotation.Nullable final InstallIntent value) {
        this._intent = value;
    }
    /**
     * Sets the settings property value. The settings for target assignment defined by the admin.
     * @param value Value to set for the settings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettings(@javax.annotation.Nullable final MobileAppAssignmentSettings value) {
        this._settings = value;
    }
    /**
     * Sets the source property value. Represents source of assignment.
     * @param value Value to set for the source property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSource(@javax.annotation.Nullable final DeviceAndAppManagementAssignmentSource value) {
        this._source = value;
    }
    /**
     * Sets the sourceId property value. The identifier of the source of the assignment.
     * @param value Value to set for the sourceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceId(@javax.annotation.Nullable final String value) {
        this._sourceId = value;
    }
    /**
     * Sets the target property value. The target group assignment defined by the admin.
     * @param value Value to set for the target property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTarget(@javax.annotation.Nullable final DeviceAndAppManagementAssignmentTarget value) {
        this._target = value;
    }
}
