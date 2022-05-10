package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkTeamsClientConfiguration implements AdditionalDataHolder, Parsable {
    /** The configuration of the Microsoft Teams client user account for a device. */
    private TeamworkAccountConfiguration _accountConfiguration;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The configuration of Microsoft Teams client features for a device. */
    private TeamworkFeaturesConfiguration _featuresConfiguration;
    /**
     * Instantiates a new teamworkTeamsClientConfiguration and sets the default values.
     * @return a void
     */
    public TeamworkTeamsClientConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkTeamsClientConfiguration
     */
    @javax.annotation.Nonnull
    public static TeamworkTeamsClientConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkTeamsClientConfiguration();
    }
    /**
     * Gets the accountConfiguration property value. The configuration of the Microsoft Teams client user account for a device.
     * @return a teamworkAccountConfiguration
     */
    @javax.annotation.Nullable
    public TeamworkAccountConfiguration getAccountConfiguration() {
        return this._accountConfiguration;
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
     * Gets the featuresConfiguration property value. The configuration of Microsoft Teams client features for a device.
     * @return a teamworkFeaturesConfiguration
     */
    @javax.annotation.Nullable
    public TeamworkFeaturesConfiguration getFeaturesConfiguration() {
        return this._featuresConfiguration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkTeamsClientConfiguration currentObject = this;
        return new HashMap<>(2) {{
            this.put("accountConfiguration", (n) -> { currentObject.setAccountConfiguration(n.getObjectValue(TeamworkAccountConfiguration::createFromDiscriminatorValue)); });
            this.put("featuresConfiguration", (n) -> { currentObject.setFeaturesConfiguration(n.getObjectValue(TeamworkFeaturesConfiguration::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("accountConfiguration", this.getAccountConfiguration());
        writer.writeObjectValue("featuresConfiguration", this.getFeaturesConfiguration());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accountConfiguration property value. The configuration of the Microsoft Teams client user account for a device.
     * @param value Value to set for the accountConfiguration property.
     * @return a void
     */
    public void setAccountConfiguration(@javax.annotation.Nullable final TeamworkAccountConfiguration value) {
        this._accountConfiguration = value;
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
     * Sets the featuresConfiguration property value. The configuration of Microsoft Teams client features for a device.
     * @param value Value to set for the featuresConfiguration property.
     * @return a void
     */
    public void setFeaturesConfiguration(@javax.annotation.Nullable final TeamworkFeaturesConfiguration value) {
        this._featuresConfiguration = value;
    }
}
