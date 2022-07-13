package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Admin consent information. */
public class AdminConsent implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Admin consent state. */
    private AdminConsentState _shareAPNSData;
    /** Admin consent state. */
    private AdminConsentState _shareUserExperienceAnalyticsData;
    /**
     * Instantiates a new adminConsent and sets the default values.
     * @return a void
     */
    public AdminConsent() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a adminConsent
     */
    @javax.annotation.Nonnull
    public static AdminConsent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdminConsent();
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
        final AdminConsent currentObject = this;
        return new HashMap<>(2) {{
            this.put("shareAPNSData", (n) -> { currentObject.setShareAPNSData(n.getEnumValue(AdminConsentState.class)); });
            this.put("shareUserExperienceAnalyticsData", (n) -> { currentObject.setShareUserExperienceAnalyticsData(n.getEnumValue(AdminConsentState.class)); });
        }};
    }
    /**
     * Gets the shareAPNSData property value. Admin consent state.
     * @return a adminConsentState
     */
    @javax.annotation.Nullable
    public AdminConsentState getShareAPNSData() {
        return this._shareAPNSData;
    }
    /**
     * Gets the shareUserExperienceAnalyticsData property value. Admin consent state.
     * @return a adminConsentState
     */
    @javax.annotation.Nullable
    public AdminConsentState getShareUserExperienceAnalyticsData() {
        return this._shareUserExperienceAnalyticsData;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("shareAPNSData", this.getShareAPNSData());
        writer.writeEnumValue("shareUserExperienceAnalyticsData", this.getShareUserExperienceAnalyticsData());
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
     * Sets the shareAPNSData property value. Admin consent state.
     * @param value Value to set for the shareAPNSData property.
     * @return a void
     */
    public void setShareAPNSData(@javax.annotation.Nullable final AdminConsentState value) {
        this._shareAPNSData = value;
    }
    /**
     * Sets the shareUserExperienceAnalyticsData property value. Admin consent state.
     * @param value Value to set for the shareUserExperienceAnalyticsData property.
     * @return a void
     */
    public void setShareUserExperienceAnalyticsData(@javax.annotation.Nullable final AdminConsentState value) {
        this._shareUserExperienceAnalyticsData = value;
    }
}
