package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The suggestedEnrollmentLimit resource represents the suggested enrollment limit when given an enrollment type. */
public class SuggestedEnrollmentLimit implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The suggested enrollment limit within a day */
    private Integer _suggestedDailyLimit;
    /**
     * Instantiates a new suggestedEnrollmentLimit and sets the default values.
     * @return a void
     */
    public SuggestedEnrollmentLimit() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a suggestedEnrollmentLimit
     */
    @javax.annotation.Nonnull
    public static SuggestedEnrollmentLimit createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SuggestedEnrollmentLimit();
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
        final SuggestedEnrollmentLimit currentObject = this;
        return new HashMap<>(1) {{
            this.put("suggestedDailyLimit", (n) -> { currentObject.setSuggestedDailyLimit(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the suggestedDailyLimit property value. The suggested enrollment limit within a day
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSuggestedDailyLimit() {
        return this._suggestedDailyLimit;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("suggestedDailyLimit", this.getSuggestedDailyLimit());
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
     * Sets the suggestedDailyLimit property value. The suggested enrollment limit within a day
     * @param value Value to set for the suggestedDailyLimit property.
     * @return a void
     */
    public void setSuggestedDailyLimit(@javax.annotation.Nullable final Integer value) {
        this._suggestedDailyLimit = value;
    }
}
