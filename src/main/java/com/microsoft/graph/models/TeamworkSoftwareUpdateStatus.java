package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkSoftwareUpdateStatus implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The available software version to update.
     */
    private String availableVersion;
    /**
     * The current software version.
     */
    private String currentVersion;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The update status of the software. The possible values are: unknown, latest, updateAvailable, unknownFutureValue.
     */
    private TeamworkSoftwareFreshness softwareFreshness;
    /**
     * Instantiates a new teamworkSoftwareUpdateStatus and sets the default values.
     */
    public TeamworkSoftwareUpdateStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkSoftwareUpdateStatus
     */
    @jakarta.annotation.Nonnull
    public static TeamworkSoftwareUpdateStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkSoftwareUpdateStatus();
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
     * Gets the availableVersion property value. The available software version to update.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAvailableVersion() {
        return this.availableVersion;
    }
    /**
     * Gets the currentVersion property value. The current software version.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCurrentVersion() {
        return this.currentVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("availableVersion", (n) -> { this.setAvailableVersion(n.getStringValue()); });
        deserializerMap.put("currentVersion", (n) -> { this.setCurrentVersion(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("softwareFreshness", (n) -> { this.setSoftwareFreshness(n.getEnumValue(TeamworkSoftwareFreshness.class)); });
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
     * Gets the softwareFreshness property value. The update status of the software. The possible values are: unknown, latest, updateAvailable, unknownFutureValue.
     * @return a teamworkSoftwareFreshness
     */
    @jakarta.annotation.Nullable
    public TeamworkSoftwareFreshness getSoftwareFreshness() {
        return this.softwareFreshness;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("availableVersion", this.getAvailableVersion());
        writer.writeStringValue("currentVersion", this.getCurrentVersion());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("softwareFreshness", this.getSoftwareFreshness());
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
     * Sets the availableVersion property value. The available software version to update.
     * @param value Value to set for the availableVersion property.
     */
    public void setAvailableVersion(@jakarta.annotation.Nullable final String value) {
        this.availableVersion = value;
    }
    /**
     * Sets the currentVersion property value. The current software version.
     * @param value Value to set for the currentVersion property.
     */
    public void setCurrentVersion(@jakarta.annotation.Nullable final String value) {
        this.currentVersion = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the softwareFreshness property value. The update status of the software. The possible values are: unknown, latest, updateAvailable, unknownFutureValue.
     * @param value Value to set for the softwareFreshness property.
     */
    public void setSoftwareFreshness(@jakarta.annotation.Nullable final TeamworkSoftwareFreshness value) {
        this.softwareFreshness = value;
    }
}
