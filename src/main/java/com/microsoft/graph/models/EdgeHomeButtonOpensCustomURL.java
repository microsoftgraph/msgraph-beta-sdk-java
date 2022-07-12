package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EdgeHomeButtonOpensCustomURL extends EdgeHomeButtonConfiguration implements Parsable {
    /** The specific URL to load. */
    private String _homeButtonCustomURL;
    /**
     * Instantiates a new EdgeHomeButtonOpensCustomURL and sets the default values.
     * @return a void
     */
    public EdgeHomeButtonOpensCustomURL() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EdgeHomeButtonOpensCustomURL
     */
    @javax.annotation.Nonnull
    public static EdgeHomeButtonOpensCustomURL createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdgeHomeButtonOpensCustomURL();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EdgeHomeButtonOpensCustomURL currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("homeButtonCustomURL", (n) -> { currentObject.setHomeButtonCustomURL(n.getStringValue()); });
        }};
    }
    /**
     * Gets the homeButtonCustomURL property value. The specific URL to load.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHomeButtonCustomURL() {
        return this._homeButtonCustomURL;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("homeButtonCustomURL", this.getHomeButtonCustomURL());
    }
    /**
     * Sets the homeButtonCustomURL property value. The specific URL to load.
     * @param value Value to set for the homeButtonCustomURL property.
     * @return a void
     */
    public void setHomeButtonCustomURL(@javax.annotation.Nullable final String value) {
        this._homeButtonCustomURL = value;
    }
}
