import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;

/**
 * This program returns the following three memory values
 * <p>
 * Returns the amount of used memory in bytes.
 * <p>
 * Returns the amount of memory in bytes that is committed for the Java virtual machine to use.
 * This amount of memory is guaranteed for the Java virtual machine to use
 * <p>
 * Returns the maximum amount of memory in bytes that can be used for memory management.
 * This method returns -1 if the maximum memory size is undefined.
 *
 * @author rajeshp
 * @Date 10/17/22
 */
public class HeapStatus {

    // 1 Megabyte is equal to 1048576 bytes (binary)
    public static final long MEGABYTE = 1048576;

    public static void main(String[] args) {

        //Returns the managed bean for the memory system of the Java virtual machine.
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();

        System.out.println(String
                .format("Heap: %sM used, %sM commited, %sM max",
                        memoryMXBean.getHeapMemoryUsage().getUsed()
                                / MEGABYTE, memoryMXBean
                                .getHeapMemoryUsage().getCommitted()
                                / MEGABYTE, memoryMXBean
                                .getHeapMemoryUsage().getMax() / MEGABYTE));

    }
}
