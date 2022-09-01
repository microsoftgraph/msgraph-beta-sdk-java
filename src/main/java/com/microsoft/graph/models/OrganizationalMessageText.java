package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains the text that will be displayed to users for a particular variant */
public class OrganizationalMessageText implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates the text that will be displayed on the button of the message. This field applies to the softLanding surface */
    private String _buttonText;
    /** Indicates the url that the user will be directed to when the message is clicked */
    private String _clickUrl;
    /** Indicates the message that will be displayed */
    private String _message;
    /** The OdataType property */
    private String _odataType;
    /** Indicates the title that will be displayed */
    private String _title;
    /**
     * Instantiates a new organizationalMessageText and sets the default values.
     * @return a void
     */
    public OrganizationalMessageText() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.organizationalMessageText");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a organizationalMessageText
     */
    @javax.annotation.Nonnull
    public static OrganizationalMessageText createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationalMessageText();
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
     * Gets the buttonText property value. Indicates the text that will be displayed on the button of the message. This field applies to the softLanding surface
     * @return a string
     */
    @javax.annotation.Nullable
    public String getButtonText() {
        return this._buttonText;
    }
    /**
     * Gets the clickUrl property value. Indicates the url that the user will be directed to when the message is clicked
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClickUrl() {
        return this._clickUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OrganizationalMessageText currentObject = this;
        return new HashMap<>(5) {{
            this.put("buttonText", (n) -> { currentObject.setButtonText(n.getStringValue()); });
            this.put("clickUrl", (n) -> { currentObject.setClickUrl(n.getStringValue()); });
            this.put("message", (n) -> { currentObject.setMessage(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("title", (n) -> { currentObject.setTitle(n.getStringValue()); });
        }};
    }
    /**
     * Gets the message property value. Indicates the message that will be displayed
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this._message;
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
     * Gets the title property value. Indicates the title that will be displayed
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this._title;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("buttonText", this.getButtonText());
        writer.writeStringValue("clickUrl", this.getClickUrl());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("title", this.getTitle());
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
     * Sets the buttonText property value. Indicates the text that will be displayed on the button of the message. This field applies to the softLanding surface
     * @param value Value to set for the buttonText property.
     * @return a void
     */
    public void setButtonText(@javax.annotation.Nullable final String value) {
        this._buttonText = value;
    }
    /**
     * Sets the clickUrl property value. Indicates the url that the user will be directed to when the message is clicked
     * @param value Value to set for the clickUrl property.
     * @return a void
     */
    public void setClickUrl(@javax.annotation.Nullable final String value) {
        this._clickUrl = value;
    }
    /**
     * Sets the message property value. Indicates the message that will be displayed
     * @param value Value to set for the message property.
     * @return a void
     */
    public void setMessage(@javax.annotation.Nullable final String value) {
        this._message = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the title property value. Indicates the title that will be displayed
     * @param value Value to set for the title property.
     * @return a void
     */
    public void setTitle(@javax.annotation.Nullable final String value) {
        this._title = value;
    }
}
