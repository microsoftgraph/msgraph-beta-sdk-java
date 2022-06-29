package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** A mapping of application identifiers to associated domains. */
public class MacOSAssociatedDomainsItem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The application identifier of the app to associate domains with. */
    private String _applicationIdentifier;
    /** Determines whether data should be downloaded directly or via a CDN. */
    private Boolean _directDownloadsEnabled;
    /** The list of domains to associate. */
    private java.util.List<String> _domains;
    /**
     * Instantiates a new macOSAssociatedDomainsItem and sets the default values.
     * @return a void
     */
    public MacOSAssociatedDomainsItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSAssociatedDomainsItem
     */
    @javax.annotation.Nonnull
    public static MacOSAssociatedDomainsItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSAssociatedDomainsItem();
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
     * Gets the applicationIdentifier property value. The application identifier of the app to associate domains with.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationIdentifier() {
        return this._applicationIdentifier;
    }
    /**
     * Gets the directDownloadsEnabled property value. Determines whether data should be downloaded directly or via a CDN.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDirectDownloadsEnabled() {
        return this._directDownloadsEnabled;
    }
    /**
     * Gets the domains property value. The list of domains to associate.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDomains() {
        return this._domains;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOSAssociatedDomainsItem currentObject = this;
        return new HashMap<>(3) {{
            this.put("applicationIdentifier", (n) -> { currentObject.setApplicationIdentifier(n.getStringValue()); });
            this.put("directDownloadsEnabled", (n) -> { currentObject.setDirectDownloadsEnabled(n.getBooleanValue()); });
            this.put("domains", (n) -> { currentObject.setDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("applicationIdentifier", this.getApplicationIdentifier());
        writer.writeBooleanValue("directDownloadsEnabled", this.getDirectDownloadsEnabled());
        writer.writeCollectionOfPrimitiveValues("domains", this.getDomains());
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
     * Sets the applicationIdentifier property value. The application identifier of the app to associate domains with.
     * @param value Value to set for the applicationIdentifier property.
     * @return a void
     */
    public void setApplicationIdentifier(@javax.annotation.Nullable final String value) {
        this._applicationIdentifier = value;
    }
    /**
     * Sets the directDownloadsEnabled property value. Determines whether data should be downloaded directly or via a CDN.
     * @param value Value to set for the directDownloadsEnabled property.
     * @return a void
     */
    public void setDirectDownloadsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._directDownloadsEnabled = value;
    }
    /**
     * Sets the domains property value. The list of domains to associate.
     * @param value Value to set for the domains property.
     * @return a void
     */
    public void setDomains(@javax.annotation.Nullable final java.util.List<String> value) {
        this._domains = value;
    }
}
