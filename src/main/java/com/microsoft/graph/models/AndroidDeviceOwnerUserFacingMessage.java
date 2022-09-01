package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represents a user-facing message with locale information as well as a default message to be used if the user's locale doesn't match with any of the localized messages */
public class AndroidDeviceOwnerUserFacingMessage implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The default message displayed if the user's locale doesn't match with any of the localized messages */
    private String _defaultMessage;
    /** The list of <locale, message> pairs. This collection can contain a maximum of 500 elements. */
    private java.util.List<KeyValuePair> _localizedMessages;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new androidDeviceOwnerUserFacingMessage and sets the default values.
     * @return a void
     */
    public AndroidDeviceOwnerUserFacingMessage() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.androidDeviceOwnerUserFacingMessage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidDeviceOwnerUserFacingMessage
     */
    @javax.annotation.Nonnull
    public static AndroidDeviceOwnerUserFacingMessage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerUserFacingMessage();
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
     * Gets the defaultMessage property value. The default message displayed if the user's locale doesn't match with any of the localized messages
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultMessage() {
        return this._defaultMessage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidDeviceOwnerUserFacingMessage currentObject = this;
        return new HashMap<>(3) {{
            this.put("defaultMessage", (n) -> { currentObject.setDefaultMessage(n.getStringValue()); });
            this.put("localizedMessages", (n) -> { currentObject.setLocalizedMessages(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the localizedMessages property value. The list of <locale, message> pairs. This collection can contain a maximum of 500 elements.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getLocalizedMessages() {
        return this._localizedMessages;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("defaultMessage", this.getDefaultMessage());
        writer.writeCollectionOfObjectValues("localizedMessages", this.getLocalizedMessages());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the defaultMessage property value. The default message displayed if the user's locale doesn't match with any of the localized messages
     * @param value Value to set for the defaultMessage property.
     * @return a void
     */
    public void setDefaultMessage(@javax.annotation.Nullable final String value) {
        this._defaultMessage = value;
    }
    /**
     * Sets the localizedMessages property value. The list of <locale, message> pairs. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the localizedMessages property.
     * @return a void
     */
    public void setLocalizedMessages(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._localizedMessages = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
