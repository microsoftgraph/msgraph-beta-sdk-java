package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsWebApp extends MobileApp implements Parsable {
    /** The web app URL. */
    private String _appUrl;
    /**
     * Instantiates a new WindowsWebApp and sets the default values.
     * @return a void
     */
    public WindowsWebApp() {
        super();
        this.setOdataType("#microsoft.graph.windowsWebApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsWebApp
     */
    @javax.annotation.Nonnull
    public static WindowsWebApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsWebApp();
    }
    /**
     * Gets the appUrl property value. The web app URL.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppUrl() {
        return this._appUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsWebApp currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appUrl", (n) -> { currentObject.setAppUrl(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appUrl", this.getAppUrl());
    }
    /**
     * Sets the appUrl property value. The web app URL.
     * @param value Value to set for the appUrl property.
     * @return a void
     */
    public void setAppUrl(@javax.annotation.Nullable final String value) {
        this._appUrl = value;
    }
}
