package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The user experience analytics work from anywhere Windows 10 devices summary.  */
public class UserExperienceAnalyticsWindows10DevicesSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The count of Windows 10 devices that have unsupported OS versions.  */
    private Integer _unsupportedOSversionDeviceCount;
    /**
     * Instantiates a new userExperienceAnalyticsWindows10DevicesSummary and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsWindows10DevicesSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsWindows10DevicesSummary
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsWindows10DevicesSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsWindows10DevicesSummary();
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
        final UserExperienceAnalyticsWindows10DevicesSummary currentObject = this;
        return new HashMap<>(1) {{
            this.put("unsupportedOSversionDeviceCount", (n) -> { currentObject.setUnsupportedOSversionDeviceCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the unsupportedOSversionDeviceCount property value. The count of Windows 10 devices that have unsupported OS versions.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnsupportedOSversionDeviceCount() {
        return this._unsupportedOSversionDeviceCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("unsupportedOSversionDeviceCount", this.getUnsupportedOSversionDeviceCount());
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
     * Sets the unsupportedOSversionDeviceCount property value. The count of Windows 10 devices that have unsupported OS versions.
     * @param value Value to set for the unsupportedOSversionDeviceCount property.
     * @return a void
     */
    public void setUnsupportedOSversionDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._unsupportedOSversionDeviceCount = value;
    }
}
