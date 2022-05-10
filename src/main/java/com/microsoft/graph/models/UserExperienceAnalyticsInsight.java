package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The user experience analytics insight is the recomendation to improve the user experience analytics score. */
public class UserExperienceAnalyticsInsight implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The unique identifier of the user experience analytics insight. */
    private String _insightId;
    /** The value of the user experience analytics insight. Possible values are: none, informational, warning, error. */
    private UserExperienceAnalyticsInsightSeverity _severity;
    /** The unique identifier of the user experience analytics insight. */
    private String _userExperienceAnalyticsMetricId;
    /** The value of the user experience analytics insight. */
    private java.util.List<UserExperienceAnalyticsInsightValue> _values;
    /**
     * Instantiates a new userExperienceAnalyticsInsight and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsInsight() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsInsight
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsInsight createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsInsight();
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
        final UserExperienceAnalyticsInsight currentObject = this;
        return new HashMap<>(4) {{
            this.put("insightId", (n) -> { currentObject.setInsightId(n.getStringValue()); });
            this.put("severity", (n) -> { currentObject.setSeverity(n.getEnumValue(UserExperienceAnalyticsInsightSeverity.class)); });
            this.put("userExperienceAnalyticsMetricId", (n) -> { currentObject.setUserExperienceAnalyticsMetricId(n.getStringValue()); });
            this.put("values", (n) -> { currentObject.setValues(n.getCollectionOfObjectValues(UserExperienceAnalyticsInsightValue::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the insightId property value. The unique identifier of the user experience analytics insight.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInsightId() {
        return this._insightId;
    }
    /**
     * Gets the severity property value. The value of the user experience analytics insight. Possible values are: none, informational, warning, error.
     * @return a userExperienceAnalyticsInsightSeverity
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsInsightSeverity getSeverity() {
        return this._severity;
    }
    /**
     * Gets the userExperienceAnalyticsMetricId property value. The unique identifier of the user experience analytics insight.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserExperienceAnalyticsMetricId() {
        return this._userExperienceAnalyticsMetricId;
    }
    /**
     * Gets the values property value. The value of the user experience analytics insight.
     * @return a userExperienceAnalyticsInsightValue
     */
    @javax.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsInsightValue> getValues() {
        return this._values;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("insightId", this.getInsightId());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeStringValue("userExperienceAnalyticsMetricId", this.getUserExperienceAnalyticsMetricId());
        writer.writeCollectionOfObjectValues("values", this.getValues());
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
     * Sets the insightId property value. The unique identifier of the user experience analytics insight.
     * @param value Value to set for the insightId property.
     * @return a void
     */
    public void setInsightId(@javax.annotation.Nullable final String value) {
        this._insightId = value;
    }
    /**
     * Sets the severity property value. The value of the user experience analytics insight. Possible values are: none, informational, warning, error.
     * @param value Value to set for the severity property.
     * @return a void
     */
    public void setSeverity(@javax.annotation.Nullable final UserExperienceAnalyticsInsightSeverity value) {
        this._severity = value;
    }
    /**
     * Sets the userExperienceAnalyticsMetricId property value. The unique identifier of the user experience analytics insight.
     * @param value Value to set for the userExperienceAnalyticsMetricId property.
     * @return a void
     */
    public void setUserExperienceAnalyticsMetricId(@javax.annotation.Nullable final String value) {
        this._userExperienceAnalyticsMetricId = value;
    }
    /**
     * Sets the values property value. The value of the user experience analytics insight.
     * @param value Value to set for the values property.
     * @return a void
     */
    public void setValues(@javax.annotation.Nullable final java.util.List<UserExperienceAnalyticsInsightValue> value) {
        this._values = value;
    }
}
