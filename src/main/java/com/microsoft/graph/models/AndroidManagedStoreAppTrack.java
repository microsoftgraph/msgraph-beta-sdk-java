package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains track information for Android Managed Store apps.
 */
public class AndroidManagedStoreAppTrack implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Friendly name for track.
     */
    private String trackAlias;
    /**
     * Unique track identifier.
     */
    private String trackId;
    /**
     * Instantiates a new androidManagedStoreAppTrack and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AndroidManagedStoreAppTrack() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidManagedStoreAppTrack
     */
    @jakarta.annotation.Nonnull
    public static AndroidManagedStoreAppTrack createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidManagedStoreAppTrack();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("trackAlias", (n) -> { this.setTrackAlias(n.getStringValue()); });
        deserializerMap.put("trackId", (n) -> { this.setTrackId(n.getStringValue()); });
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
     * Gets the trackAlias property value. Friendly name for track.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTrackAlias() {
        return this.trackAlias;
    }
    /**
     * Gets the trackId property value. Unique track identifier.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTrackId() {
        return this.trackId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("trackAlias", this.getTrackAlias());
        writer.writeStringValue("trackId", this.getTrackId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the trackAlias property value. Friendly name for track.
     * @param value Value to set for the trackAlias property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTrackAlias(@jakarta.annotation.Nullable final String value) {
        this.trackAlias = value;
    }
    /**
     * Sets the trackId property value. Unique track identifier.
     * @param value Value to set for the trackId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTrackId(@jakarta.annotation.Nullable final String value) {
        this.trackId = value;
    }
}
