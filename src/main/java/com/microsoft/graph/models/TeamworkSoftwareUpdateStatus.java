package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkSoftwareUpdateStatus implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The available software version to update. */
    private String _availableVersion;
    /** The current software version. */
    private String _currentVersion;
    /** The OdataType property */
    private String _odataType;
    /** The update status of the software. The possible values are: unknown, latest, updateAvailable, unknownFutureValue. */
    private TeamworkSoftwareFreshness _softwareFreshness;
    /**
     * Instantiates a new teamworkSoftwareUpdateStatus and sets the default values.
     * @return a void
     */
    public TeamworkSoftwareUpdateStatus() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.teamworkSoftwareUpdateStatus");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkSoftwareUpdateStatus
     */
    @javax.annotation.Nonnull
    public static TeamworkSoftwareUpdateStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkSoftwareUpdateStatus();
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
     * Gets the availableVersion property value. The available software version to update.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAvailableVersion() {
        return this._availableVersion;
    }
    /**
     * Gets the currentVersion property value. The current software version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCurrentVersion() {
        return this._currentVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkSoftwareUpdateStatus currentObject = this;
        return new HashMap<>(4) {{
            this.put("availableVersion", (n) -> { currentObject.setAvailableVersion(n.getStringValue()); });
            this.put("currentVersion", (n) -> { currentObject.setCurrentVersion(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("softwareFreshness", (n) -> { currentObject.setSoftwareFreshness(n.getEnumValue(TeamworkSoftwareFreshness.class)); });
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
     * Gets the softwareFreshness property value. The update status of the software. The possible values are: unknown, latest, updateAvailable, unknownFutureValue.
     * @return a teamworkSoftwareFreshness
     */
    @javax.annotation.Nullable
    public TeamworkSoftwareFreshness getSoftwareFreshness() {
        return this._softwareFreshness;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("availableVersion", this.getAvailableVersion());
        writer.writeStringValue("currentVersion", this.getCurrentVersion());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("softwareFreshness", this.getSoftwareFreshness());
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
     * Sets the availableVersion property value. The available software version to update.
     * @param value Value to set for the availableVersion property.
     * @return a void
     */
    public void setAvailableVersion(@javax.annotation.Nullable final String value) {
        this._availableVersion = value;
    }
    /**
     * Sets the currentVersion property value. The current software version.
     * @param value Value to set for the currentVersion property.
     * @return a void
     */
    public void setCurrentVersion(@javax.annotation.Nullable final String value) {
        this._currentVersion = value;
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
     * Sets the softwareFreshness property value. The update status of the software. The possible values are: unknown, latest, updateAvailable, unknownFutureValue.
     * @param value Value to set for the softwareFreshness property.
     * @return a void
     */
    public void setSoftwareFreshness(@javax.annotation.Nullable final TeamworkSoftwareFreshness value) {
        this._softwareFreshness = value;
    }
}
