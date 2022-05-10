package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InformationalUrls implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The appSignUpUrl property */
    private String _appSignUpUrl;
    /** The singleSignOnDocumentationUrl property */
    private String _singleSignOnDocumentationUrl;
    /**
     * Instantiates a new informationalUrls and sets the default values.
     * @return a void
     */
    public InformationalUrls() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a informationalUrls
     */
    @javax.annotation.Nonnull
    public static InformationalUrls createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InformationalUrls();
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
     * Gets the appSignUpUrl property value. The appSignUpUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppSignUpUrl() {
        return this._appSignUpUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final InformationalUrls currentObject = this;
        return new HashMap<>(2) {{
            this.put("appSignUpUrl", (n) -> { currentObject.setAppSignUpUrl(n.getStringValue()); });
            this.put("singleSignOnDocumentationUrl", (n) -> { currentObject.setSingleSignOnDocumentationUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the singleSignOnDocumentationUrl property value. The singleSignOnDocumentationUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSingleSignOnDocumentationUrl() {
        return this._singleSignOnDocumentationUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appSignUpUrl", this.getAppSignUpUrl());
        writer.writeStringValue("singleSignOnDocumentationUrl", this.getSingleSignOnDocumentationUrl());
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
     * Sets the appSignUpUrl property value. The appSignUpUrl property
     * @param value Value to set for the appSignUpUrl property.
     * @return a void
     */
    public void setAppSignUpUrl(@javax.annotation.Nullable final String value) {
        this._appSignUpUrl = value;
    }
    /**
     * Sets the singleSignOnDocumentationUrl property value. The singleSignOnDocumentationUrl property
     * @param value Value to set for the singleSignOnDocumentationUrl property.
     * @return a void
     */
    public void setSingleSignOnDocumentationUrl(@javax.annotation.Nullable final String value) {
        this._singleSignOnDocumentationUrl = value;
    }
}
