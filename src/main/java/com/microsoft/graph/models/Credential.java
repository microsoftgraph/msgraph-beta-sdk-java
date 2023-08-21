package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Credential implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The name of the field for this credential. e.g, username or password or phoneNumber. This is defined by the application. Must match what is in the html field on singleSignOnSettings/password object.
     */
    private String fieldId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The type for this credential. Valid values: username, password, or other.
     */
    private String type;
    /**
     * The value for this credential. e.g, mysuperhiddenpassword. Note the value for passwords is write-only, the value can never be read back.
     */
    private String value;
    /**
     * Instantiates a new credential and sets the default values.
     */
    public Credential() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a credential
     */
    @jakarta.annotation.Nonnull
    public static Credential createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Credential();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("fieldId", (n) -> { this.setFieldId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fieldId property value. The name of the field for this credential. e.g, username or password or phoneNumber. This is defined by the application. Must match what is in the html field on singleSignOnSettings/password object.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFieldId() {
        return this.fieldId;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the type property value. The type for this credential. Valid values: username, password, or other.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the value property value. The value for this credential. e.g, mysuperhiddenpassword. Note the value for passwords is write-only, the value can never be read back.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("fieldId", this.getFieldId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("type", this.getType());
        writer.writeStringValue("value", this.getValue());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the fieldId property value. The name of the field for this credential. e.g, username or password or phoneNumber. This is defined by the application. Must match what is in the html field on singleSignOnSettings/password object.
     * @param value Value to set for the fieldId property.
     */
    public void setFieldId(@jakarta.annotation.Nullable final String value) {
        this.fieldId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the type property value. The type for this credential. Valid values: username, password, or other.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the value property value. The value for this credential. e.g, mysuperhiddenpassword. Note the value for passwords is write-only, the value can never be read back.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
