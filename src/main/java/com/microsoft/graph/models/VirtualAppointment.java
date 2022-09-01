package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VirtualAppointment extends Entity implements Parsable {
    /** The join web URL of the virtual appointment for clients with waiting room and browser join. Optional. */
    private String _appointmentClientJoinWebUrl;
    /** The client information for the virtual appointment, including name, email, and SMS phone number. Optional. */
    private java.util.List<VirtualAppointmentUser> _appointmentClients;
    /** The identifier of the appointment from the scheduling system, associated with the current virtual appointment. Optional. */
    private String _externalAppointmentId;
    /** The URL of the appointment resource from the scheduling system, associated with the current virtual appointment. Optional. */
    private String _externalAppointmentUrl;
    /** The settings associated with the virtual appointment resource. Optional. */
    private VirtualAppointmentSettings _settings;
    /**
     * Instantiates a new virtualAppointment and sets the default values.
     * @return a void
     */
    public VirtualAppointment() {
        super();
        this.setOdataType("#microsoft.graph.virtualAppointment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a virtualAppointment
     */
    @javax.annotation.Nonnull
    public static VirtualAppointment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualAppointment();
    }
    /**
     * Gets the appointmentClientJoinWebUrl property value. The join web URL of the virtual appointment for clients with waiting room and browser join. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppointmentClientJoinWebUrl() {
        return this._appointmentClientJoinWebUrl;
    }
    /**
     * Gets the appointmentClients property value. The client information for the virtual appointment, including name, email, and SMS phone number. Optional.
     * @return a virtualAppointmentUser
     */
    @javax.annotation.Nullable
    public java.util.List<VirtualAppointmentUser> getAppointmentClients() {
        return this._appointmentClients;
    }
    /**
     * Gets the externalAppointmentId property value. The identifier of the appointment from the scheduling system, associated with the current virtual appointment. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalAppointmentId() {
        return this._externalAppointmentId;
    }
    /**
     * Gets the externalAppointmentUrl property value. The URL of the appointment resource from the scheduling system, associated with the current virtual appointment. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalAppointmentUrl() {
        return this._externalAppointmentUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final VirtualAppointment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appointmentClientJoinWebUrl", (n) -> { currentObject.setAppointmentClientJoinWebUrl(n.getStringValue()); });
            this.put("appointmentClients", (n) -> { currentObject.setAppointmentClients(n.getCollectionOfObjectValues(VirtualAppointmentUser::createFromDiscriminatorValue)); });
            this.put("externalAppointmentId", (n) -> { currentObject.setExternalAppointmentId(n.getStringValue()); });
            this.put("externalAppointmentUrl", (n) -> { currentObject.setExternalAppointmentUrl(n.getStringValue()); });
            this.put("settings", (n) -> { currentObject.setSettings(n.getObjectValue(VirtualAppointmentSettings::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the settings property value. The settings associated with the virtual appointment resource. Optional.
     * @return a virtualAppointmentSettings
     */
    @javax.annotation.Nullable
    public VirtualAppointmentSettings getSettings() {
        return this._settings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appointmentClientJoinWebUrl", this.getAppointmentClientJoinWebUrl());
        writer.writeCollectionOfObjectValues("appointmentClients", this.getAppointmentClients());
        writer.writeStringValue("externalAppointmentId", this.getExternalAppointmentId());
        writer.writeStringValue("externalAppointmentUrl", this.getExternalAppointmentUrl());
        writer.writeObjectValue("settings", this.getSettings());
    }
    /**
     * Sets the appointmentClientJoinWebUrl property value. The join web URL of the virtual appointment for clients with waiting room and browser join. Optional.
     * @param value Value to set for the appointmentClientJoinWebUrl property.
     * @return a void
     */
    public void setAppointmentClientJoinWebUrl(@javax.annotation.Nullable final String value) {
        this._appointmentClientJoinWebUrl = value;
    }
    /**
     * Sets the appointmentClients property value. The client information for the virtual appointment, including name, email, and SMS phone number. Optional.
     * @param value Value to set for the appointmentClients property.
     * @return a void
     */
    public void setAppointmentClients(@javax.annotation.Nullable final java.util.List<VirtualAppointmentUser> value) {
        this._appointmentClients = value;
    }
    /**
     * Sets the externalAppointmentId property value. The identifier of the appointment from the scheduling system, associated with the current virtual appointment. Optional.
     * @param value Value to set for the externalAppointmentId property.
     * @return a void
     */
    public void setExternalAppointmentId(@javax.annotation.Nullable final String value) {
        this._externalAppointmentId = value;
    }
    /**
     * Sets the externalAppointmentUrl property value. The URL of the appointment resource from the scheduling system, associated with the current virtual appointment. Optional.
     * @param value Value to set for the externalAppointmentUrl property.
     * @return a void
     */
    public void setExternalAppointmentUrl(@javax.annotation.Nullable final String value) {
        this._externalAppointmentUrl = value;
    }
    /**
     * Sets the settings property value. The settings associated with the virtual appointment resource. Optional.
     * @param value Value to set for the settings property.
     * @return a void
     */
    public void setSettings(@javax.annotation.Nullable final VirtualAppointmentSettings value) {
        this._settings = value;
    }
}
