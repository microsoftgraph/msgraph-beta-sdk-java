package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Operating System version range.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OperatingSystemVersionRange implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The description of this range (e.g. Valid 1702 builds)
     */
    private String description;
    /**
     * The highest inclusive version that this range contains.
     */
    private String highestVersion;
    /**
     * The lowest inclusive version that this range contains.
     */
    private String lowestVersion;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new operatingSystemVersionRange and sets the default values.
     */
    public OperatingSystemVersionRange() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a operatingSystemVersionRange
     */
    @jakarta.annotation.Nonnull
    public static OperatingSystemVersionRange createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OperatingSystemVersionRange();
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
     * Gets the description property value. The description of this range (e.g. Valid 1702 builds)
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("highestVersion", (n) -> { this.setHighestVersion(n.getStringValue()); });
        deserializerMap.put("lowestVersion", (n) -> { this.setLowestVersion(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the highestVersion property value. The highest inclusive version that this range contains.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getHighestVersion() {
        return this.highestVersion;
    }
    /**
     * Gets the lowestVersion property value. The lowest inclusive version that this range contains.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLowestVersion() {
        return this.lowestVersion;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("highestVersion", this.getHighestVersion());
        writer.writeStringValue("lowestVersion", this.getLowestVersion());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the description property value. The description of this range (e.g. Valid 1702 builds)
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the highestVersion property value. The highest inclusive version that this range contains.
     * @param value Value to set for the highestVersion property.
     */
    public void setHighestVersion(@jakarta.annotation.Nullable final String value) {
        this.highestVersion = value;
    }
    /**
     * Sets the lowestVersion property value. The lowest inclusive version that this range contains.
     * @param value Value to set for the lowestVersion property.
     */
    public void setLowestVersion(@jakarta.annotation.Nullable final String value) {
        this.lowestVersion = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
