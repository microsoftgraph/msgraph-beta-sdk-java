package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VirtualAppointmentUser implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The display name of the user who participates in a virtual appointment. Optional. */
    private String _displayName;
    /** The email address of the user who participates in a virtual appointment. Optional. */
    private String _emailAddress;
    /** The OdataType property */
    private String _odataType;
    /** The phone number for sending SMS texts for the user who participates in a virtual appointment. Optional. */
    private String _smsCapablePhoneNumber;
    /**
     * Instantiates a new virtualAppointmentUser and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VirtualAppointmentUser() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.virtualAppointmentUser");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a virtualAppointmentUser
     */
    @javax.annotation.Nonnull
    public static VirtualAppointmentUser createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualAppointmentUser();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the displayName property value. The display name of the user who participates in a virtual appointment. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the emailAddress property value. The email address of the user who participates in a virtual appointment. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailAddress() {
        return this._emailAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final VirtualAppointmentUser currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("emailAddress", (n) -> { currentObject.setEmailAddress(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("smsCapablePhoneNumber", (n) -> { currentObject.setSmsCapablePhoneNumber(n.getStringValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the smsCapablePhoneNumber property value. The phone number for sending SMS texts for the user who participates in a virtual appointment. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSmsCapablePhoneNumber() {
        return this._smsCapablePhoneNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("emailAddress", this.getEmailAddress());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("smsCapablePhoneNumber", this.getSmsCapablePhoneNumber());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the displayName property value. The display name of the user who participates in a virtual appointment. Optional.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the emailAddress property value. The email address of the user who participates in a virtual appointment. Optional.
     * @param value Value to set for the emailAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailAddress(@javax.annotation.Nullable final String value) {
        this._emailAddress = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the smsCapablePhoneNumber property value. The phone number for sending SMS texts for the user who participates in a virtual appointment. Optional.
     * @param value Value to set for the smsCapablePhoneNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmsCapablePhoneNumber(@javax.annotation.Nullable final String value) {
        this._smsCapablePhoneNumber = value;
    }
}
