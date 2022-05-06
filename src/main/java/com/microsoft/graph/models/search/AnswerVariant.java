package microsoft.graph.models.search;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.DevicePlatformType;
public class AnswerVariant implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Answer variation description shown on search results page.  */
    private String _description;
    /** Answer variation name displayed in search results.  */
    private String _displayName;
    /** The languageTag property  */
    private String _languageTag;
    /** The platform property  */
    private DevicePlatformType _platform;
    /** Answer variation URL link. When users click this answer variation in search results, they will go to this URL.  */
    private String _webUrl;
    /**
     * Instantiates a new answerVariant and sets the default values.
     * @return a void
     */
    public AnswerVariant() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a answerVariant
     */
    @javax.annotation.Nonnull
    public static AnswerVariant createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AnswerVariant();
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
     * Gets the description property value. Answer variation description shown on search results page.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Answer variation name displayed in search results.
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
        final AnswerVariant currentObject = this;
        return new HashMap<>(5) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("languageTag", (n) -> { currentObject.setLanguageTag(n.getStringValue()); });
            this.put("platform", (n) -> { currentObject.setPlatform(n.getEnumValue(DevicePlatformType.class)); });
            this.put("webUrl", (n) -> { currentObject.setWebUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the languageTag property value. The languageTag property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLanguageTag() {
        return this._languageTag;
    }
    /**
     * Gets the platform property value. The platform property
     * @return a devicePlatformType
     */
    @javax.annotation.Nullable
    public DevicePlatformType getPlatform() {
        return this._platform;
    }
    /**
     * Gets the webUrl property value. Answer variation URL link. When users click this answer variation in search results, they will go to this URL.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this._webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("languageTag", this.getLanguageTag());
        writer.writeEnumValue("platform", this.getPlatform());
        writer.writeStringValue("webUrl", this.getWebUrl());
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
     * Sets the description property value. Answer variation description shown on search results page.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Answer variation name displayed in search results.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the languageTag property value. The languageTag property
     * @param value Value to set for the languageTag property.
     * @return a void
     */
    public void setLanguageTag(@javax.annotation.Nullable final String value) {
        this._languageTag = value;
    }
    /**
     * Sets the platform property value. The platform property
     * @param value Value to set for the platform property.
     * @return a void
     */
    public void setPlatform(@javax.annotation.Nullable final DevicePlatformType value) {
        this._platform = value;
    }
    /**
     * Sets the webUrl property value. Answer variation URL link. When users click this answer variation in search results, they will go to this URL.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
