package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DirectorySizeQuota implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Total amount of the directory quota.  */
    private Integer _total;
    /** Used amount of the directory quota.  */
    private Integer _used;
    /**
     * Instantiates a new directorySizeQuota and sets the default values.
     * @return a void
     */
    public DirectorySizeQuota() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a directorySizeQuota
     */
    @javax.annotation.Nonnull
    public static DirectorySizeQuota createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DirectorySizeQuota();
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
        final DirectorySizeQuota currentObject = this;
        return new HashMap<>(2) {{
            this.put("total", (n) -> { currentObject.setTotal(n.getIntegerValue()); });
            this.put("used", (n) -> { currentObject.setUsed(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the total property value. Total amount of the directory quota.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotal() {
        return this._total;
    }
    /**
     * Gets the used property value. Used amount of the directory quota.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUsed() {
        return this._used;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("total", this.getTotal());
        writer.writeIntegerValue("used", this.getUsed());
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
     * Sets the total property value. Total amount of the directory quota.
     * @param value Value to set for the total property.
     * @return a void
     */
    public void setTotal(@javax.annotation.Nullable final Integer value) {
        this._total = value;
    }
    /**
     * Sets the used property value. Used amount of the directory quota.
     * @param value Value to set for the used property.
     * @return a void
     */
    public void setUsed(@javax.annotation.Nullable final Integer value) {
        this._used = value;
    }
}
