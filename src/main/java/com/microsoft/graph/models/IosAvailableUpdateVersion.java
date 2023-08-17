package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * iOS available update version details
 */
public class IosAvailableUpdateVersion implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The expiration date of the update.
     */
    private OffsetDateTime expirationDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The posting date of the update.
     */
    private OffsetDateTime postingDateTime;
    /**
     * The version of the update.
     */
    private String productVersion;
    /**
     * List of supported devices for the update.
     */
    private java.util.List<String> supportedDevices;
    /**
     * Instantiates a new iosAvailableUpdateVersion and sets the default values.
     */
    public IosAvailableUpdateVersion() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosAvailableUpdateVersion
     */
    @jakarta.annotation.Nonnull
    public static IosAvailableUpdateVersion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosAvailableUpdateVersion();
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
     * Gets the expirationDateTime property value. The expiration date of the update.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("postingDateTime", (n) -> { this.setPostingDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("productVersion", (n) -> { this.setProductVersion(n.getStringValue()); });
        deserializerMap.put("supportedDevices", (n) -> { this.setSupportedDevices(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
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
     * Gets the postingDateTime property value. The posting date of the update.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPostingDateTime() {
        return this.postingDateTime;
    }
    /**
     * Gets the productVersion property value. The version of the update.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getProductVersion() {
        return this.productVersion;
    }
    /**
     * Gets the supportedDevices property value. List of supported devices for the update.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportedDevices() {
        return this.supportedDevices;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the expirationDateTime property value. The expiration date of the update.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the postingDateTime property value. The posting date of the update.
     * @param value Value to set for the postingDateTime property.
     */
    public void setPostingDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.postingDateTime = value;
    }
    /**
     * Sets the productVersion property value. The version of the update.
     * @param value Value to set for the productVersion property.
     */
    public void setProductVersion(@jakarta.annotation.Nullable final String value) {
        this.productVersion = value;
    }
    /**
     * Sets the supportedDevices property value. List of supported devices for the update.
     * @param value Value to set for the supportedDevices property.
     */
    public void setSupportedDevices(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.supportedDevices = value;
    }
}
