package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a user-facing message with locale information as well as a default message to be used if the user's locale doesn't match with any of the localized messages
 */
public class AndroidDeviceOwnerUserFacingMessage implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The default message displayed if the user's locale doesn't match with any of the localized messages
     */
    private String defaultMessage;
    /**
     * The list of <locale, message> pairs. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<KeyValuePair> localizedMessages;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new androidDeviceOwnerUserFacingMessage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerUserFacingMessage() {
        this.setAdditionalData(new HashMap<>());
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
        return this.additionalData;
    }
    /**
     * Gets the defaultMessage property value. The default message displayed if the user's locale doesn't match with any of the localized messages
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultMessage() {
        return this.defaultMessage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("defaultMessage", (n) -> { this.setDefaultMessage(n.getStringValue()); });
        deserializerMap.put("localizedMessages", (n) -> { this.setLocalizedMessages(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the localizedMessages property value. The list of <locale, message> pairs. This collection can contain a maximum of 500 elements.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getLocalizedMessages() {
        return this.localizedMessages;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("defaultMessage", this.getDefaultMessage());
        writer.writeCollectionOfObjectValues("localizedMessages", this.getLocalizedMessages());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the defaultMessage property value. The default message displayed if the user's locale doesn't match with any of the localized messages
     * @param value Value to set for the defaultMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultMessage(@javax.annotation.Nullable final String value) {
        this.defaultMessage = value;
    }
    /**
     * Sets the localizedMessages property value. The list of <locale, message> pairs. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the localizedMessages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalizedMessages(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.localizedMessages = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
