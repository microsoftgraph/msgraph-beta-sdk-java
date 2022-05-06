package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkAccountConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The account used to sync the calendar.  */
    private TeamworkOnPremisesCalendarSyncConfiguration _onPremisesCalendarSyncConfiguration;
    /** The supported client for Teams Rooms devices. The possible values are: unknown, skypeDefaultAndTeams, teamsDefaultAndSkype, skypeOnly, teamsOnly, unknownFutureValue.  */
    private TeamworkSupportedClient _supportedClient;
    /**
     * Instantiates a new teamworkAccountConfiguration and sets the default values.
     * @return a void
     */
    public TeamworkAccountConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkAccountConfiguration
     */
    @javax.annotation.Nonnull
    public static TeamworkAccountConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkAccountConfiguration();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkAccountConfiguration currentObject = this;
        return new HashMap<>(2) {{
            this.put("onPremisesCalendarSyncConfiguration", (n) -> { currentObject.setOnPremisesCalendarSyncConfiguration(n.getObjectValue(TeamworkOnPremisesCalendarSyncConfiguration::createFromDiscriminatorValue)); });
            this.put("supportedClient", (n) -> { currentObject.setSupportedClient(n.getEnumValue(TeamworkSupportedClient.class)); });
        }};
    }
    /**
     * Gets the onPremisesCalendarSyncConfiguration property value. The account used to sync the calendar.
     * @return a teamworkOnPremisesCalendarSyncConfiguration
     */
    @javax.annotation.Nullable
    public TeamworkOnPremisesCalendarSyncConfiguration getOnPremisesCalendarSyncConfiguration() {
        return this._onPremisesCalendarSyncConfiguration;
    }
    /**
     * Gets the supportedClient property value. The supported client for Teams Rooms devices. The possible values are: unknown, skypeDefaultAndTeams, teamsDefaultAndSkype, skypeOnly, teamsOnly, unknownFutureValue.
     * @return a teamworkSupportedClient
     */
    @javax.annotation.Nullable
    public TeamworkSupportedClient getSupportedClient() {
        return this._supportedClient;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("onPremisesCalendarSyncConfiguration", this.getOnPremisesCalendarSyncConfiguration());
        writer.writeEnumValue("supportedClient", this.getSupportedClient());
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
     * Sets the onPremisesCalendarSyncConfiguration property value. The account used to sync the calendar.
     * @param value Value to set for the onPremisesCalendarSyncConfiguration property.
     * @return a void
     */
    public void setOnPremisesCalendarSyncConfiguration(@javax.annotation.Nullable final TeamworkOnPremisesCalendarSyncConfiguration value) {
        this._onPremisesCalendarSyncConfiguration = value;
    }
    /**
     * Sets the supportedClient property value. The supported client for Teams Rooms devices. The possible values are: unknown, skypeDefaultAndTeams, teamsDefaultAndSkype, skypeOnly, teamsOnly, unknownFutureValue.
     * @param value Value to set for the supportedClient property.
     * @return a void
     */
    public void setSupportedClient(@javax.annotation.Nullable final TeamworkSupportedClient value) {
        this._supportedClient = value;
    }
}
