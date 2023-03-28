package com.microsoft.graph.users.item.manageddevices.item.enablelostmode;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EnableLostModePostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The footer property */
    private String footer;
    /** The message property */
    private String message;
    /** The phoneNumber property */
    private String phoneNumber;
    /**
     * Instantiates a new enableLostModePostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EnableLostModePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a enableLostModePostRequestBody
     */
    @javax.annotation.Nonnull
    public static EnableLostModePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnableLostModePostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("footer", (n) -> { this.setFooter(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the footer property value. The footer property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFooter() {
        return this.footer;
    }
    /**
     * Gets the message property value. The message property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the phoneNumber property value. The phoneNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("footer", this.getFooter());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the footer property value. The footer property
     * @param value Value to set for the footer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFooter(@javax.annotation.Nullable final String value) {
        this.footer = value;
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessage(@javax.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the phoneNumber property value. The phoneNumber property
     * @param value Value to set for the phoneNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhoneNumber(@javax.annotation.Nullable final String value) {
        this.phoneNumber = value;
    }
}
