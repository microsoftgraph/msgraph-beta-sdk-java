package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Application data for reporting */
public class ManagedDeviceReportedApp implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The application or bundle identifier of the application */
    private String _appId;
    /**
     * Instantiates a new managedDeviceReportedApp and sets the default values.
     * @return a void
     */
    public ManagedDeviceReportedApp() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedDeviceReportedApp
     */
    @javax.annotation.Nonnull
    public static ManagedDeviceReportedApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceReportedApp();
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
     * Gets the appId property value. The application or bundle identifier of the application
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this._appId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedDeviceReportedApp currentObject = this;
        return new HashMap<>(1) {{
            this.put("appId", (n) -> { currentObject.setAppId(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appId", this.getAppId());
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
     * Sets the appId property value. The application or bundle identifier of the application
     * @param value Value to set for the appId property.
     * @return a void
     */
    public void setAppId(@javax.annotation.Nullable final String value) {
        this._appId = value;
    }
}
