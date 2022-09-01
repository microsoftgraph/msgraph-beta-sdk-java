package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** iOS available update version details */
public class IosAvailableUpdateVersion implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The expiration date of the update. */
    private OffsetDateTime _expirationDateTime;
    /** The OdataType property */
    private String _odataType;
    /** The posting date of the update. */
    private OffsetDateTime _postingDateTime;
    /** The version of the update. */
    private String _productVersion;
    /** List of supported devices for the update. */
    private java.util.List<String> _supportedDevices;
    /**
     * Instantiates a new iosAvailableUpdateVersion and sets the default values.
     * @return a void
     */
    public IosAvailableUpdateVersion() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.iosAvailableUpdateVersion");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosAvailableUpdateVersion
     */
    @javax.annotation.Nonnull
    public static IosAvailableUpdateVersion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosAvailableUpdateVersion();
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
     * Gets the expirationDateTime property value. The expiration date of the update.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosAvailableUpdateVersion currentObject = this;
        return new HashMap<>(5) {{
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("postingDateTime", (n) -> { currentObject.setPostingDateTime(n.getOffsetDateTimeValue()); });
            this.put("productVersion", (n) -> { currentObject.setProductVersion(n.getStringValue()); });
            this.put("supportedDevices", (n) -> { currentObject.setSupportedDevices(n.getCollectionOfPrimitiveValues(String.class)); });
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
     * Gets the postingDateTime property value. The posting date of the update.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getPostingDateTime() {
        return this._postingDateTime;
    }
    /**
     * Gets the productVersion property value. The version of the update.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductVersion() {
        return this._productVersion;
    }
    /**
     * Gets the supportedDevices property value. List of supported devices for the update.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSupportedDevices() {
        return this._supportedDevices;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("postingDateTime", this.getPostingDateTime());
        writer.writeStringValue("productVersion", this.getProductVersion());
        writer.writeCollectionOfPrimitiveValues("supportedDevices", this.getSupportedDevices());
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
     * Sets the expirationDateTime property value. The expiration date of the update.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
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
     * Sets the postingDateTime property value. The posting date of the update.
     * @param value Value to set for the postingDateTime property.
     * @return a void
     */
    public void setPostingDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._postingDateTime = value;
    }
    /**
     * Sets the productVersion property value. The version of the update.
     * @param value Value to set for the productVersion property.
     * @return a void
     */
    public void setProductVersion(@javax.annotation.Nullable final String value) {
        this._productVersion = value;
    }
    /**
     * Sets the supportedDevices property value. List of supported devices for the update.
     * @param value Value to set for the supportedDevices property.
     * @return a void
     */
    public void setSupportedDevices(@javax.annotation.Nullable final java.util.List<String> value) {
        this._supportedDevices = value;
    }
}
