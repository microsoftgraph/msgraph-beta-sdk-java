package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EdiscoveryHoldPolicy extends PolicyBase implements Parsable {
    /** The contentQuery property */
    private String _contentQuery;
    /** The errors property */
    private java.util.List<String> _errors;
    /** The isEnabled property */
    private Boolean _isEnabled;
    /** The siteSources property */
    private java.util.List<SiteSource> _siteSources;
    /** The userSources property */
    private java.util.List<UserSource> _userSources;
    /**
     * Instantiates a new ediscoveryHoldPolicy and sets the default values.
     * @return a void
     */
    public EdiscoveryHoldPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ediscoveryHoldPolicy
     */
    @javax.annotation.Nonnull
    public static EdiscoveryHoldPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryHoldPolicy();
    }
    /**
     * Gets the contentQuery property value. The contentQuery property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentQuery() {
        return this._contentQuery;
    }
    /**
     * Gets the errors property value. The errors property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getErrors() {
        return this._errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EdiscoveryHoldPolicy currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("contentQuery", (n) -> { currentObject.setContentQuery(n.getStringValue()); });
            this.put("errors", (n) -> { currentObject.setErrors(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("isEnabled", (n) -> { currentObject.setIsEnabled(n.getBooleanValue()); });
            this.put("siteSources", (n) -> { currentObject.setSiteSources(n.getCollectionOfObjectValues(SiteSource::createFromDiscriminatorValue)); });
            this.put("userSources", (n) -> { currentObject.setUserSources(n.getCollectionOfObjectValues(UserSource::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isEnabled property value. The isEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this._isEnabled;
    }
    /**
     * Gets the siteSources property value. The siteSources property
     * @return a siteSource
     */
    @javax.annotation.Nullable
    public java.util.List<SiteSource> getSiteSources() {
        return this._siteSources;
    }
    /**
     * Gets the userSources property value. The userSources property
     * @return a userSource
     */
    @javax.annotation.Nullable
    public java.util.List<UserSource> getUserSources() {
        return this._userSources;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("contentQuery", this.getContentQuery());
        writer.writeCollectionOfPrimitiveValues("errors", this.getErrors());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeCollectionOfObjectValues("siteSources", this.getSiteSources());
        writer.writeCollectionOfObjectValues("userSources", this.getUserSources());
    }
    /**
     * Sets the contentQuery property value. The contentQuery property
     * @param value Value to set for the contentQuery property.
     * @return a void
     */
    public void setContentQuery(@javax.annotation.Nullable final String value) {
        this._contentQuery = value;
    }
    /**
     * Sets the errors property value. The errors property
     * @param value Value to set for the errors property.
     * @return a void
     */
    public void setErrors(@javax.annotation.Nullable final java.util.List<String> value) {
        this._errors = value;
    }
    /**
     * Sets the isEnabled property value. The isEnabled property
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEnabled = value;
    }
    /**
     * Sets the siteSources property value. The siteSources property
     * @param value Value to set for the siteSources property.
     * @return a void
     */
    public void setSiteSources(@javax.annotation.Nullable final java.util.List<SiteSource> value) {
        this._siteSources = value;
    }
    /**
     * Sets the userSources property value. The userSources property
     * @param value Value to set for the userSources property.
     * @return a void
     */
    public void setUserSources(@javax.annotation.Nullable final java.util.List<UserSource> value) {
        this._userSources = value;
    }
}
