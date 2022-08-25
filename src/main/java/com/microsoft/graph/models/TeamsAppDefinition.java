package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class TeamsAppDefinition extends Entity implements Parsable {
    /** A collection of scopes where the Teams app can be installed. Possible values are:team — Indicates that the Teams app can be installed within a team and is authorized to access that team's data. groupChat  — Indicates that the Teams app can be installed within a group chat and is authorized to access that group chat's data.  personal — Indicates that the Teams app can be installed in the personal scope of a user and is authorized to access that user's data. */
    private TeamsAppInstallationScopes _allowedInstallationScopes;
    /** The WebApplicationInfo.Id from the Teams app manifest. */
    private String _azureADAppId;
    /** The details of the bot specified in the Teams app manifest. */
    private TeamworkBot _bot;
    /** The color version of the Teams app's icon. */
    private TeamsAppIcon _colorIcon;
    /** The createdBy property */
    private IdentitySet _createdBy;
    /** The description property */
    private String _description;
    /** The name of the app provided by the app developer. */
    private String _displayName;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /** The outline version of the Teams app's icon. */
    private TeamsAppIcon _outlineIcon;
    /** The published status of a specific version of a Teams app. Possible values are:submitted — The specific version of the Teams app has been submitted and is under review. published  — The request to publish the specific version of the Teams app has been approved by the admin and the app is published.  rejected — The request to publish the specific version of the Teams app was rejected by the admin. */
    private TeamsAppPublishingState _publishingState;
    /** The shortdescription property */
    private String _shortdescription;
    /** The ID from the Teams app manifest. */
    private String _teamsAppId;
    /** The version number of the application. */
    private String _version;
    /**
     * Instantiates a new teamsAppDefinition and sets the default values.
     * @return a void
     */
    public TeamsAppDefinition() {
        super();
        this.setOdataType("#microsoft.graph.teamsAppDefinition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamsAppDefinition
     */
    @javax.annotation.Nonnull
    public static TeamsAppDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsAppDefinition();
    }
    /**
     * Gets the allowedInstallationScopes property value. A collection of scopes where the Teams app can be installed. Possible values are:team — Indicates that the Teams app can be installed within a team and is authorized to access that team's data. groupChat  — Indicates that the Teams app can be installed within a group chat and is authorized to access that group chat's data.  personal — Indicates that the Teams app can be installed in the personal scope of a user and is authorized to access that user's data.
     * @return a teamsAppInstallationScopes
     */
    @javax.annotation.Nullable
    public TeamsAppInstallationScopes getAllowedInstallationScopes() {
        return this._allowedInstallationScopes;
    }
    /**
     * Gets the azureADAppId property value. The WebApplicationInfo.Id from the Teams app manifest.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureADAppId() {
        return this._azureADAppId;
    }
    /**
     * Gets the bot property value. The details of the bot specified in the Teams app manifest.
     * @return a teamworkBot
     */
    @javax.annotation.Nullable
    public TeamworkBot getBot() {
        return this._bot;
    }
    /**
     * Gets the colorIcon property value. The color version of the Teams app's icon.
     * @return a teamsAppIcon
     */
    @javax.annotation.Nullable
    public TeamsAppIcon getColorIcon() {
        return this._colorIcon;
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The name of the app provided by the app developer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamsAppDefinition currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowedInstallationScopes", (n) -> { currentObject.setAllowedInstallationScopes(n.getEnumValue(TeamsAppInstallationScopes.class)); });
            this.put("azureADAppId", (n) -> { currentObject.setAzureADAppId(n.getStringValue()); });
            this.put("bot", (n) -> { currentObject.setBot(n.getObjectValue(TeamworkBot::createFromDiscriminatorValue)); });
            this.put("colorIcon", (n) -> { currentObject.setColorIcon(n.getObjectValue(TeamsAppIcon::createFromDiscriminatorValue)); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("outlineIcon", (n) -> { currentObject.setOutlineIcon(n.getObjectValue(TeamsAppIcon::createFromDiscriminatorValue)); });
            this.put("publishingState", (n) -> { currentObject.setPublishingState(n.getEnumValue(TeamsAppPublishingState.class)); });
            this.put("shortdescription", (n) -> { currentObject.setShortdescription(n.getStringValue()); });
            this.put("teamsAppId", (n) -> { currentObject.setTeamsAppId(n.getStringValue()); });
            this.put("version", (n) -> { currentObject.setVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the outlineIcon property value. The outline version of the Teams app's icon.
     * @return a teamsAppIcon
     */
    @javax.annotation.Nullable
    public TeamsAppIcon getOutlineIcon() {
        return this._outlineIcon;
    }
    /**
     * Gets the publishingState property value. The published status of a specific version of a Teams app. Possible values are:submitted — The specific version of the Teams app has been submitted and is under review. published  — The request to publish the specific version of the Teams app has been approved by the admin and the app is published.  rejected — The request to publish the specific version of the Teams app was rejected by the admin.
     * @return a teamsAppPublishingState
     */
    @javax.annotation.Nullable
    public TeamsAppPublishingState getPublishingState() {
        return this._publishingState;
    }
    /**
     * Gets the shortdescription property value. The shortdescription property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getShortdescription() {
        return this._shortdescription;
    }
    /**
     * Gets the teamsAppId property value. The ID from the Teams app manifest.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTeamsAppId() {
        return this._teamsAppId;
    }
    /**
     * Gets the version property value. The version number of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("allowedInstallationScopes", this.getAllowedInstallationScopes());
        writer.writeStringValue("azureADAppId", this.getAzureADAppId());
        writer.writeObjectValue("bot", this.getBot());
        writer.writeObjectValue("colorIcon", this.getColorIcon());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("outlineIcon", this.getOutlineIcon());
        writer.writeEnumValue("publishingState", this.getPublishingState());
        writer.writeStringValue("shortdescription", this.getShortdescription());
        writer.writeStringValue("teamsAppId", this.getTeamsAppId());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the allowedInstallationScopes property value. A collection of scopes where the Teams app can be installed. Possible values are:team — Indicates that the Teams app can be installed within a team and is authorized to access that team's data. groupChat  — Indicates that the Teams app can be installed within a group chat and is authorized to access that group chat's data.  personal — Indicates that the Teams app can be installed in the personal scope of a user and is authorized to access that user's data.
     * @param value Value to set for the allowedInstallationScopes property.
     * @return a void
     */
    public void setAllowedInstallationScopes(@javax.annotation.Nullable final TeamsAppInstallationScopes value) {
        this._allowedInstallationScopes = value;
    }
    /**
     * Sets the azureADAppId property value. The WebApplicationInfo.Id from the Teams app manifest.
     * @param value Value to set for the azureADAppId property.
     * @return a void
     */
    public void setAzureADAppId(@javax.annotation.Nullable final String value) {
        this._azureADAppId = value;
    }
    /**
     * Sets the bot property value. The details of the bot specified in the Teams app manifest.
     * @param value Value to set for the bot property.
     * @return a void
     */
    public void setBot(@javax.annotation.Nullable final TeamworkBot value) {
        this._bot = value;
    }
    /**
     * Sets the colorIcon property value. The color version of the Teams app's icon.
     * @param value Value to set for the colorIcon property.
     * @return a void
     */
    public void setColorIcon(@javax.annotation.Nullable final TeamsAppIcon value) {
        this._colorIcon = value;
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The name of the app provided by the app developer.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the outlineIcon property value. The outline version of the Teams app's icon.
     * @param value Value to set for the outlineIcon property.
     * @return a void
     */
    public void setOutlineIcon(@javax.annotation.Nullable final TeamsAppIcon value) {
        this._outlineIcon = value;
    }
    /**
     * Sets the publishingState property value. The published status of a specific version of a Teams app. Possible values are:submitted — The specific version of the Teams app has been submitted and is under review. published  — The request to publish the specific version of the Teams app has been approved by the admin and the app is published.  rejected — The request to publish the specific version of the Teams app was rejected by the admin.
     * @param value Value to set for the publishingState property.
     * @return a void
     */
    public void setPublishingState(@javax.annotation.Nullable final TeamsAppPublishingState value) {
        this._publishingState = value;
    }
    /**
     * Sets the shortdescription property value. The shortdescription property
     * @param value Value to set for the shortdescription property.
     * @return a void
     */
    public void setShortdescription(@javax.annotation.Nullable final String value) {
        this._shortdescription = value;
    }
    /**
     * Sets the teamsAppId property value. The ID from the Teams app manifest.
     * @param value Value to set for the teamsAppId property.
     * @return a void
     */
    public void setTeamsAppId(@javax.annotation.Nullable final String value) {
        this._teamsAppId = value;
    }
    /**
     * Sets the version property value. The version number of the application.
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final String value) {
        this._version = value;
    }
}
