import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Chatbot extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextArea ca = new JTextArea();
    private JTextField cf = new JTextField();
    private JButton b = new JButton();
    private JLabel l = new JLabel();

    Chatbot() { // Layout and Properties defined in Constructor

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);
        f.setSize(400, 400);
        f.getContentPane().setBackground(Color.cyan);
        f.setTitle("ChatBot");

        JScrollPane scrollPane = new JScrollPane(ca);
        scrollPane.setBounds(1, 1, 300, 310); // Set bounds for the scroll pane
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // Enable vertical scrolling
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); // Enable horizontal scrolling
        f.add(scrollPane);

        cf.setSize(300, 20);
        cf.setLocation(1, 320);
        f.add(cf);

        f.add(b);
        l.setText("SEND");
        b.add(l);
        b.setSize(80, 20);
        b.setLocation(300, 320);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b) { // Message sent on Click button

                    String text = cf.getText().toLowerCase();
                    ca.setForeground(Color.BLACK);
                    ca.append("You-->" + text + "\n");
                    cf.setText("");

                    if (text.contains("hi")) { // input Checking
                        replyMeth("Hi there");
                    } else if (text.contains("how are you")) {
                        replyMeth("I'm Good :).Thank you for asking");
                    } else if (text.contains("what is your name")) {
                        replyMeth("I'm SAU AI");
                    } else if (text.contains("gender")) {
                        replyMeth("I'm AI so I don't have a gender.");
                    } else if (text.contains("love you")) {
                        replyMeth("I'm Feeling Shy :) Love you too");
                    } else if (text.contains("hello")) {
                        replyMeth("hello there");
                    } else if (text.contains("where is lpu")) {
                        replyMeth("Jalandhar - Delhi, Grand Trunk Rd, Phagwara, Punjab 144001");
                    } else if (text.contains("is lpu expensive")) {
                        replyMeth("LPU fees vary for different courses and range somewhere between Rs 20,000 to Rs 5,00,000 (per annum) depending on the course or specialization.");
                    } else if (text.contains("why lpu is so famous")) {
                        replyMeth("It is a multi-disciplinary university in India that offers more than 150 programs.");
                    } else if (text.contains("bye")) {
                        replyMeth("Too Soon :( Anyways" + "\n" + "STAY HOME STAY SAFE ");
                    } else if (text.contains("is lpu difficult")) {
                        replyMeth("LPU NEST requires work on your part and is neither difficult nor easy. ");
                    } else if (text.contains("can i study free in lpu")) {
                        replyMeth("Students can study for free at LPU thanks to a number of scholarships, such as the LPUNEST Scholarship, which pays for up to 100% of tuition. ");
                    } else if (text.contains("what is the lpu hostel fee")) {
                        replyMeth("Room Category\tCharges for Full Academic Session With EDB#\tCharges for Full Academic Session without EDB#\r\n" + //
                                                        "AC\tRs. 80000/-\tRs. 90000/-\r\n" + //
                                                        "Non- AC*\tRs. 70000/-\tRs. 80000/- ");
                    } else if (text.contains("is lpu placement good")) {
                        replyMeth("LPU is known to offer robust placement opportunities to its students with 504 students getting a package above INR 5 LPA during the LPU Placement 2022.");
                    } else if (text.contains("does google visit lpu")) {
                        replyMeth("Yes LPU's students are placed in companies like Google, Amazon, Microsoft etc");
                    } else if (text.contains("what is the minimum salary in lpu")) {
                        replyMeth("The average Lovely Professional University monthly salary ranges from approximately ₹ 22,239 per month for Deputy Chief Executive Officer to ₹ 69,476 per month for Associate Professor.");
                    } else if (text.contains("what is the rank of lpu in private university")) {
                        replyMeth("Lovely Professional University (LPU) is one of the top private universities in Chaheru, India. It is ranked #251-300 in QS WUR Ranking By Subject 2024.");
                    }else if (text.contains("is lpu good for cse")) {
                        replyMeth("LPU provides world-class facilities, infrastructure, and exposure to the students.");
                    }else if (text.contains("what are the admission criteria for lpu?")) {
                        replyMeth("The admission criteria for LPU vary depending on the course. Generally, it includes performance in entrance exams, academic records, and sometimes interviews or group discussions.");
                    } else if (text.contains("does lpu offer scholarships?")) {
                        replyMeth("Yes, LPU offers scholarships to eligible students based on various criteria such as academic merit, sports achievements, and socioeconomic background.");
                    } else if (text.contains("what are the facilities available at lpu?")) {
                        replyMeth("LPU provides a wide range of facilities including state-of-the-art labs, libraries, sports complexes, auditoriums, and medical facilities.");
                    } else if (text.contains("can you tell me about the faculty at lpu?")) {
                        replyMeth("LPU has a highly qualified and experienced faculty consisting of professors, associate professors, and assistant professors, many of whom have industry experience and advanced degrees.");
                    } else if (text.contains("what extracurricular activities does lpu offer")) {
                        replyMeth("LPU offers a variety of extracurricular activities including sports, cultural events, clubs and societies, student organizations, and community service programs.");
                    } else if (text.contains("does lpu have hostel facilities for international students?")) {
                        replyMeth("Yes, LPU provides hostel facilities for both domestic and international students with separate accommodations and amenities.");
                    } else if (text.contains("what is the campus size of lpu")) {
                        replyMeth("The Lovely Professional University campus is spread over a vast area, with extensive greenery and modern infrastructure, making it one of the largest campuses in India.");
                    } else if (text.contains("can you provide information about the courses offered at lpu")) {
                        replyMeth("LPU offers a wide range of undergraduate, postgraduate, and doctoral programs in various disciplines including engineering, management, computer science, pharmacy, law, and more.");
                    } else if (text.contains("what is the application process for lpu?")) {
                        replyMeth("The application process for LPU typically involves filling out an online application form, submitting required documents, and paying the application fee. Detailed instructions are available on the university's website.");
                    } else if (text.contains("does lpu have tie-ups with international universities?")) {
                        replyMeth("Yes, LPU has collaborations and tie-ups with several international universities and institutions for student exchange programs, research partnerships, and joint academic initiatives.");
                    }else if (text.contains("what is the average class size at lpu")) {
                        replyMeth("The average class size at LPU varies depending on the course and program. However, LPU focuses on maintaining a conducive student-teacher ratio to ensure personalized attention and effective learning.");
                    } else if (text.contains("does lpu provide internships for students")) {
                        replyMeth("Yes, LPU facilitates internships for students through its industry connections and placement cell. Students are provided with opportunities to gain practical experience and industry exposure.");
                    } else if (text.contains("what are the career prospects after graduating from lpu")) {
                        replyMeth("Graduates from LPU have diverse career prospects across various sectors including IT, engineering, management, healthcare, education, and more. The university's strong industry connections and placement support contribute to high employability.");
                    } else if (text.contains("does lpu have research facilities")) {
                        replyMeth("Yes, LPU has state-of-the-art research facilities and laboratories equipped with advanced equipment and resources to support research activities across different disciplines.");
                    } else if (text.contains("what is the student demographic at lpu")) {
                        replyMeth("LPU has a diverse student body comprising students from different states of India as well as international students from various countries. The university promotes inclusivity and cultural exchange among its students.");
                    } else if (text.contains("are there any industry collaborations for practical training at lpu")) {
                        replyMeth("Yes, LPU has collaborations with various industries and corporate partners to provide practical training, workshops, and industry exposure to its students, enhancing their employability and skill development.");
                    } else if (text.contains("what support services does lpu offer for students")) {
                        replyMeth("LPU offers a range of support services for students including counseling services, career guidance, academic advising, disability support, and campus facilities to ensure their holistic development and well-being.");
                    } else if (text.contains("does lpu have a vibrant student community")) {
                        replyMeth("Yes, LPU has a vibrant and active student community with numerous clubs, societies, cultural events, and extracurricular activities, fostering a lively and engaging campus environment.");
                    } else if (text.contains("what is the alumni network like at lpu")) {
                        replyMeth("LPU has a strong alumni network spread across various industries and sectors globally. The alumni association provides opportunities for networking, mentorship, and career support for current students and graduates.");
                    } else if (text.contains("does lpu offer distance education programs")) {
                        replyMeth("Yes, LPU offers distance education programs for students who are unable to attend regular classes. These programs provide flexibility and convenience for working professionals and students with other commitments.");
                    }else if (text.contains("what are the campus amenities at lpu")) {
                        replyMeth("LPU provides various campus amenities including Wi-Fi connectivity, libraries, cafeterias, banking facilities, medical services, transportation, and recreational areas.");
                    } else if (text.contains("how does lpu support entrepreneurship")) {
                        replyMeth("LPU has initiatives and support programs for budding entrepreneurs including incubation centers, startup competitions, mentorship, and access to funding and resources.");
                    } else if (text.contains("does lpu have a strong alumni network")) {
                        replyMeth("Yes, LPU boasts a strong alumni network with graduates holding prominent positions in various industries and sectors worldwide. Alumni often engage in mentorship and career guidance activities for current students.");
                    } else if (text.contains("what are the admission deadlines for lpu")) {
                        replyMeth("Admission deadlines for LPU vary depending on the course and program. It's advisable to check the university website or contact the admissions office for specific deadlines and application requirements.");
                    } else if (text.contains("what are the research areas of focus at lpu")) {
                        replyMeth("LPU focuses on research across diverse areas including renewable energy, biotechnology, artificial intelligence, nanotechnology, business management, and social sciences, among others.");
                    } else if (text.contains("how is the hostel accommodation at lpu")) {
                        replyMeth("LPU offers comfortable and secure hostel accommodation with various amenities including furnished rooms, dining facilities, common areas, security, and recreational facilities to ensure a conducive living environment for students.");
                    } else if (text.contains("does lpu organize industry visits for students")) {
                        replyMeth("Yes, LPU organizes industry visits and field trips to give students practical exposure to real-world work environments, processes, and practices, enhancing their understanding and learning.");
                    } else if (text.contains("what are the international exchange opportunities at lpu")) {
                        replyMeth("LPU offers international exchange programs and collaborations with partner universities worldwide, allowing students to study abroad, participate in cultural exchange programs, and broaden their global perspectives.");
                    } else if (text.contains("how is the campus life at lpu")) {
                        replyMeth("Campus life at LPU is vibrant and dynamic, with a plethora of academic, cultural, and recreational activities happening throughout the year. Students have ample opportunities for learning, growth, and social interaction.");
                    } else if (text.contains("does lpu provide career counseling services")) {
                        replyMeth("Yes, LPU offers career counseling services to help students explore career options, set goals, develop employability skills, and make informed decisions about their academic and professional paths.");
                    } else if (text.contains("what is the faculty-student ratio at lpu")) {
                        replyMeth("The faculty-student ratio at LPU varies across departments and programs but is generally maintained at a level that ensures personalized attention and quality education.");
                    } else if (text.contains("does lpu offer summer internship programs")) {
                        replyMeth("Yes, LPU provides summer internship programs for students to gain practical experience, industry exposure, and valuable skills during their academic break.");
                    } else if (text.contains("what are the admission requirements for international students at lpu")) {
                        replyMeth("International students applying to LPU typically need to fulfill specific admission requirements including educational qualifications, English language proficiency, and visa documentation. The university's international admissions office can provide detailed guidance.");
                    } else if (text.contains("what is the process for hostel allotment at lpu")) {
                        replyMeth("Hostel allotment at LPU is typically done based on various factors such as distance from home, availability of rooms, and student preferences. The hostel office manages the allocation process, and students can apply through the designated procedure.");
                    } else if (text.contains("does lpu offer career-oriented courses")) {
                        replyMeth("Yes, LPU offers a range of career-oriented courses designed to equip students with practical skills and knowledge relevant to current industry demands, enhancing their employability and career prospects.");
                    } else if (text.contains("what are the admission tests accepted by lpu")) {
                        replyMeth("LPU accepts various admission tests depending on the course and program. Commonly accepted tests include LPUNEST (Lovely Professional University National Entrance and Scholarship Test), JEE Main, NEET, CLAT, and others. Specific requirements are outlined on the university website.");
                    } else if (text.contains("how does lpu support student entrepreneurship")) {
                        replyMeth("LPU supports student entrepreneurship through initiatives such as startup incubation centers, mentorship programs, funding opportunities, and access to entrepreneurial resources and networks.");
                    } else if (text.contains("what is the policy on student diversity at lpu")) {
                        replyMeth("LPU values diversity and encourages students from diverse backgrounds, cultures, and regions to contribute to its vibrant academic community. The university promotes inclusivity, tolerance, and cultural exchange among its student body.");
                    } else if (text.contains("does lpu offer part-time courses for working professionals")) {
                        replyMeth("Yes, LPU offers part-time courses and flexible learning options for working professionals who wish to pursue further education while balancing their career commitments.");
                    } else if (text.contains("what are the options for financial aid at lpu")) {
                        replyMeth("LPU provides various options for financial aid including scholarships, grants, tuition fee waivers, and student loans to support eligible students in pursuing their education. The university's financial aid office assists students in exploring and accessing available resources.");
                    }else if (text.contains("what is the accreditation status of lpu")) {
                        replyMeth("LPU is accredited by recognized accreditation bodies such as NAAC (National Assessment and Accreditation Council) and NBA (National Board of Accreditation) for its quality education and infrastructure.");
                    } else if (text.contains("does lpu have industry tie-ups for research projects")) {
                        replyMeth("Yes, LPU collaborates with various industries and corporate partners for research projects, technology transfer, and innovation initiatives, fostering a culture of applied research and industry relevance.");
                    } else if (text.contains("what are the options for on-campus dining at lpu")) {
                        replyMeth("LPU offers a variety of on-campus dining options including cafeterias, food courts, restaurants, and snack bars serving a range of cuisines to cater to diverse tastes and preferences.");
                    } else if (text.contains("how does lpu support student mental health and well-being")) {
                        replyMeth("LPU prioritizes student mental health and well-being through counseling services, mental health awareness programs, stress management workshops, and support groups to help students cope with challenges and thrive academically and personally.");
                    } else if (text.contains("what is the procedure for hostel fee payment at lpu")) {
                        replyMeth("Hostel fee payment at LPU can be done through the university's online portal using various payment methods such as credit/debit cards, net banking, or offline through designated payment counters on campus. Detailed instructions are provided by the hostel office.");
                    } else if (text.contains("does lpu provide transportation facilities for students")) {
                        replyMeth("Yes, LPU offers transportation facilities for students with bus services connecting the campus to various parts of the city and nearby areas, ensuring convenient commuting for students living off-campus.");
                    } else if (text.contains("what are the options for recreational activities at lpu")) {
                        replyMeth("LPU provides a range of recreational activities and facilities including sports complexes, gymnasiums, swimming pools, indoor game rooms, and outdoor sports fields to promote physical fitness and leisure activities among students.");
                    } else if (text.contains("how does lpu promote environmental sustainability on campus")) {
                        replyMeth("LPU implements various initiatives for environmental sustainability such as waste management practices, renewable energy projects, tree planting drives, and awareness campaigns to foster a green and eco-friendly campus environment.");
                    } else if (text.contains("what are the options for off-campus housing near lpu")) {
                        replyMeth("There are several options for off-campus housing near LPU including rental apartments, PG accommodations, and private hostels. Students can explore listings through online platforms or local real estate agents.");
                    } else if (text.contains("does lpu have a policy for student grievances and complaints")) {
                        replyMeth("Yes, LPU has established mechanisms for addressing student grievances and complaints through dedicated grievance redressal cells, feedback systems, and transparent processes to ensure student satisfaction and welfare.");
                    }
                    else
                        replyMeth("I Can't Understand");

                }

            }

        });

    }

    public void replyMeth(String s) { // Reply Method
        ca.append("ChatBot-->" + s + "\n");
    }

}

public class ChatBotDemo { // Driver Class

    public static void main(String[] args) { // main class

        new Chatbot(); // instantiation
    }

}