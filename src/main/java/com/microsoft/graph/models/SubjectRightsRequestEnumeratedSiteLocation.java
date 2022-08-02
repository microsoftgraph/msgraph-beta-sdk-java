package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SubjectRightsRequestEnumeratedSiteLocation extends SubjectRightsRequestSiteLocation implements Parsable {
    /** Collection of site URLs that should be included. Includes the URL of each site, for example, https://www.contoso.com/site1. */
    private java.util.List<String> _urls;
    /**
     * Instantiates a new SubjectRightsRequestEnumeratedSiteLocation and sets the default values.
     * @return a void
     */
    public SubjectRightsRequestEnumeratedSiteLocation() {
        super();
        this.setOdataType("#microsoft.graph.subjectRightsRequestEnumeratedSiteLocation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SubjectRightsRequestEnumeratedSiteLocation
     */
    @javax.annotation.Nonnull
    public static SubjectRightsRequestEnumeratedSiteLocation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubjectRightsRequestEnumeratedSiteLocation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SubjectRightsRequestEnumeratedSiteLocation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("urls", (n) -> { currentObject.setUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the urls property value. Collection of site URLs that should be included. Includes the URL of each site, for example, https://www.contoso.com/site1.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getUrls() {
        return this._urls;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("urls", this.getUrls());
    }
    /**
     * Sets the urls property value. Collection of site URLs that should be included. Includes the URL of each site, for example, https://www.contoso.com/site1.
     * @param value Value to set for the urls property.
     * @return a void
     */
    public void setUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this._urls = value;
    }
}
