package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Operating System version range. */
public class OperatingSystemVersionRange implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The description of this range (e.g. Valid 1702 builds) */
    private String _description;
    /** The highest inclusive version that this range contains. */
    private String _highestVersion;
    /** The lowest inclusive version that this range contains. */
    private String _lowestVersion;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new operatingSystemVersionRange and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OperatingSystemVersionRange() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a operatingSystemVersionRange
     */
    @javax.annotation.Nonnull
    public static OperatingSystemVersionRange createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OperatingSystemVersionRange();
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
     * Gets the description property value. The description of this range (e.g. Valid 1702 builds)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
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
    @javax.annotation.Nullable
    public String getHighestVersion() {
        return this._highestVersion;
    }
    /**
     * Gets the lowestVersion property value. The lowest inclusive version that this range contains.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLowestVersion() {
        return this._lowestVersion;
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
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("highestVersion", this.getHighestVersion());
        writer.writeStringValue("lowestVersion", this.getLowestVersion());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the description property value. The description of this range (e.g. Valid 1702 builds)
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the highestVersion property value. The highest inclusive version that this range contains.
     * @param value Value to set for the highestVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHighestVersion(@javax.annotation.Nullable final String value) {
        this._highestVersion = value;
    }
    /**
     * Sets the lowestVersion property value. The lowest inclusive version that this range contains.
     * @param value Value to set for the lowestVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLowestVersion(@javax.annotation.Nullable final String value) {
        this._lowestVersion = value;
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
}
